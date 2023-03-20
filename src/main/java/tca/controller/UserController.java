package tca.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.security.RolesAllowed;
import tca.common.helper.Helper;
import tca.entity.user.User;
import tca.mapper.dropdown.DropDownMapper;
import tca.model.UserFilter;
import tca.security.UserPrincipal;
import tca.service.login.LoginService;
import tca.service.user.UserService;

@Controller
@RolesAllowed("ADMIN")
public class UserController {

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private DropDownMapper dropDownMapper;

    @RequestMapping("user_new")
    public String newUser(Model model, @AuthenticationPrincipal UserPrincipal user) {
        model.addAttribute("createdBy", user.getUser().getLoginId());
        model.addAttribute("roles", dropDownMapper.getRoles());
        model.addAttribute("organizations", dropDownMapper.getOrganizations());
        return "user_new";
    }

    @RequestMapping("saveUser")
    public String saveUser(User user) {
        user.setPassword(Helper.convertMD5(user.getPassword()));
        if (user.getId() == null)
            userService.addUser(user);
        else
            userService.updateUser(user);
        return "user_management";
    }

    @RequestMapping("removeUsers")
    public String removeUser(@RequestParam("ids[]") Long[] ids) {
        Arrays.asList(ids).forEach(id -> {
            log.info("deleting user id ?", id);
            userService.deleteUserById(id);
            log.info("deleted user id ?", id);
        });
        return "user_management";
    }

    @RequestMapping("user_edit")
    public String editUser(@RequestParam("id") Long id, Model model, @AuthenticationPrincipal UserPrincipal userPrincipal) {
        User user = userService.getUserById(id);
        user.setUpdatedBy(userPrincipal.getUser().getLoginId());
        model.addAttribute("user", user);
        List<String> selectedRoles = user.getRoles().stream().map(role->role.getName()).collect(Collectors.toList());
        model.addAttribute("selectedRoles", selectedRoles);
        model.addAttribute("roles", dropDownMapper.getRoles());
        model.addAttribute("organizations", dropDownMapper.getOrganizations());
        return "user_edit";
    }

    @RequestMapping("user_management")
    public String admin(Model model) {
        log.info("Go to page user_management.html");
        model.addAttribute("organizations", dropDownMapper.getOrganizations());
        return "user_management";
    }

    @RequestMapping(method = RequestMethod.GET, value = "users", headers = "Accept=application/json")
    public @ResponseBody List<User> users(@RequestParam(value = "search", required = false) String search,
                                          @RequestParam(value = "filter", required = false) UserFilter filter,
                                          @RequestParam(value = "sort", required = false) String sort,
                                          @RequestParam(value = "order", required = false) String order,
                                          @RequestParam(value = "offset", required = false) Integer offset,
                                          @RequestParam(value = "limit", required = false) Integer limit) {
        if(filter==null){
            filter = new UserFilter();
        }
        filter.setLimit(limit);
        filter.setOffset(offset);
        filter.setOrder(order);
        filter.setSearch(search);
        filter.setSort(sort);
        return userService.getUserList(filter);
    }
}
