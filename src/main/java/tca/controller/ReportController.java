package tca.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.security.RolesAllowed;
import tca.security.UserPrincipal;

@Controller
@RolesAllowed("REPORT")
public class ReportController {
	
	Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "report")
	public String report(Model model, @AuthenticationPrincipal UserPrincipal usr) {
		return "report";
	}
}
