package com.swu.grouppad.system.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.swu.grouppad.system.user.entity.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "/grouppad/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Validated User user, BindingResult bindingResult, Model model, RedirectAttributes attr) {
		// TODO 登录验证
		return "redirect:/";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(RedirectAttributes attr) {
		// TODO 注销登录
		return "redirect:/login";
	}

	@RequestMapping("/403.html")
	public String unauthorizedRole() {
		return "/grouppad/403.jsp";
	}

}
