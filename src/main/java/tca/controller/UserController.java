package tca.controller;

import jakarta.annotation.security.RolesAllowed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tca.common.helper.Helper;
import tca.entity.role.Role;
import tca.entity.user.User;
import tca.model.BootstrapTableData;
import tca.model.UserFilter;
import tca.security.UserPrincipal;
import tca.service.DropDownService;
import tca.service.login.LoginService;
import tca.service.user.UserService;

import java.util.Arrays;
import java.util.List;

@Controller
@RolesAllowed("ADMIN")
public class UserController {

    public static final String USER_MANAGEMENT = "user_management";
    public static final String ORGANIZATIONS = "organizations";
    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private DropDownService dropDownService;

    @RequestMapping("user_new")
    public String newUser(Model model, @AuthenticationPrincipal UserPrincipal user) {
        model.addAttribute("createdBy", user.getUser().getLoginId());
        model.addAttribute("roles", dropDownService.getRoles());
        model.addAttribute(ORGANIZATIONS, dropDownService.getOrganizations());
        return "user_new";
    }

    @RequestMapping("saveUser")
    public String saveUser(User user) {
        user.setPassword(Helper.convertMD5(user.getPassword()));
        if (user.getId() == null)
            userService.addUser(user);
        else
            userService.updateUser(user);
        return USER_MANAGEMENT;
    }

    @RequestMapping("removeUsers")
    public String removeUser(@RequestParam("ids[]") Long[] ids) {
        Arrays.asList(ids).forEach(id -> {
            log.info("deleting user id {}", id);
            userService.deleteUserById(id);
            log.info("deleted user id {}", id);
        });
        return USER_MANAGEMENT;
    }

    @RequestMapping("user_edit")
    public String editUser(@RequestParam("id") Long id, Model model, @AuthenticationPrincipal UserPrincipal userPrincipal) {
        User user = userService.getUserById(id);
        user.setUpdatedBy(userPrincipal.getUser().getLoginId());
        model.addAttribute("user", user);
        List<String> selectedRoles = user.getRoles().stream().map(Role::getName).toList();
        model.addAttribute("selectedRoles", selectedRoles);
        model.addAttribute("roles", dropDownService.getRoles());
        model.addAttribute(ORGANIZATIONS, dropDownService.getOrganizations());
        return "user_edit";
    }

    @RequestMapping(USER_MANAGEMENT)
    public String admin(Model model) {
        log.info("Go to page user_management.html");
        model.addAttribute(ORGANIZATIONS, dropDownService.getOrganizations());
        return USER_MANAGEMENT;
    }

    @RequestMapping(value = "users", headers = "Accept=application/json")
    public @ResponseBody BootstrapTableData<User> users(@RequestParam(value = "search", required = false) String search,
                                                        @RequestParam(value = "filter", required = false) User filter,
                                                        @RequestParam(value = "sort", required = false) String sort,
                                                        @RequestParam(value = "order", required = false) String order,
                                                        @RequestParam(value = "offset", required = false) Integer offset,
                                                        @RequestParam(value = "limit", required = false) Integer limit) {
        UserFilter userFilter = new UserFilter();
        userFilter.setFilter(filter);
        userFilter.setLimit(limit);
        userFilter.setOffset(offset);
        userFilter.setOrder(order);
        userFilter.setSearch(search);
        userFilter.setSort(sort);
        List<User> list = userService.getUserList(userFilter);

        BootstrapTableData<User> btd = new BootstrapTableData<>();
        btd.setRows(list);
        if(list.isEmpty())
            btd.setTotal(0);
        else
            btd.setTotal(userService.getTotalCount(userFilter));
        btd.setTotalNotFiltered(userService.getTotalNotFilteredCount());
        return btd;
    }
}
