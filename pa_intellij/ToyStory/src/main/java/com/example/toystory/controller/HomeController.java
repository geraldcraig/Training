package com.example.toystory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping 
public class HomeController {
	
	@GetMapping("/") 
	public String home() {
		return "index";
	}
	
	@GetMapping("/shrek") 
	public String shrek() {
		return "shrek";
	}

	@GetMapping("/toystory")
	public String toystory() {
		return "toystory";
	}

}
