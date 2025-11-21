package com.luv2code.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	int a=10;
	int b=15;
	
	public String home() {
		return "index";
	}

}
