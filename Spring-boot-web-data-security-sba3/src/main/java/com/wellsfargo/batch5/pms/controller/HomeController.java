package com.wellsfargo.batch5.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"","/","/home"})
	public String homeAction() {
		return "home-page";
	}
	
	@GetMapping("/login")
	public String loginAction() {
		
		return "login";		
	}

}
