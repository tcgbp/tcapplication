package tca.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tca.LoginProperties;
import tca.common.Helper;
import tca.common.constants.ApplicationConstants;
import tca.entity.user.User;
import tca.model.LoginUser;
import tca.security.UserPrincipal;
import tca.service.login.LoginService;
import tca.service.user.UserService;

@Controller
public class LoginController {

	private Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginProperties loginProperties;

    @Autowired
    LoginService loginService;

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String login(Model model) {
        LoginUser user = new LoginUser();
        model.addAttribute("user", user);
        model.addAttribute("enableCaptcha", loginProperties.isEnableCaptcha());
        return "login";
    }

    @GetMapping("index")
    public String index(Model model) {
        LoginUser user = new LoginUser();
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/profile")
    public String profile(Model model, @AuthenticationPrincipal UserPrincipal user) {
        model.addAttribute("user", user.getUser());
        return "profile";
    }

    @PostMapping("/saveProfile")
    public String saveProfile(User user) {
    	loginService.saveProfile(user);
        return "forward:/logout";
    }

    @GetMapping("/edit_pwd")
    public String editPwd(Model model, @AuthenticationPrincipal UserPrincipal user) {
        model.addAttribute("user", user.getUser());
        return "edit_pwd";
    }

    @PostMapping("/savePwd")
    public String savePwd(@RequestParam("newpwd") String newpwd, @AuthenticationPrincipal UserPrincipal userPrincipal) {
    	User user = userPrincipal.getUser();
    	user.setPassword(Helper.convertMD5(newpwd));
    	loginService.savePassword(user);
        return "forward:/logout";
    }

    @PostMapping("/userLogin")
    public String loginUser(@ModelAttribute("user") LoginUser user) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.isAuthenticated() && !auth.getPrincipal().equals("anonymousUser")) {
            return "index";
        } else {
            return "login";
        }
    }

    @RequestMapping("/getCaptchaImg")
    public void getImgCode(HttpServletRequest request, HttpServletResponse response) {
        int width = 90;
        int height = 30;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.black);
        graphics.setFont(new Font("Arial", Font.BOLD, 24));
        String checkCode = Helper.getCheckCode();
        HttpSession session = request.getSession();
        session.setAttribute(ApplicationConstants.IMAGE_CODE_SESSION, checkCode);
        graphics.drawString(checkCode, 15, 25);
        try {
            response.setContentType("image/png");
            ImageIO.write(image, "PNG", response.getOutputStream());
        } catch (IOException e) {
        	log.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
