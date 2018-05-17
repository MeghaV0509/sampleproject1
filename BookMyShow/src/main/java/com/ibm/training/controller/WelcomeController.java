package com.ibm.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

	@RequestMapping("/home")
	public String getWelcome() {
		return "welcome";
	}
}