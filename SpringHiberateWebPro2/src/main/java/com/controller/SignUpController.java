package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController {
	public SignUpController() {
		System.out.println("++++++++++++++");
	}
	@RequestMapping("/signUp")
	public ModelAndView getSignUp() {
		ModelAndView mav = new ModelAndView("signUp");
		return mav;
	}
}
