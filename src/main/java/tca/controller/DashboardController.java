package tca.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tca.security.UserPrincipal;

@Controller
public class DashboardController {

    @RequestMapping("dashboard")
    public String dashboard(Model model, @AuthenticationPrincipal UserPrincipal usr) {
        return "dashboard";
    }
}
