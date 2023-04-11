package com.example.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shrekmovie")
public class ShrekController {
	
	@GetMapping("")
	public String home() {
		return "The characters in the movie Shrek";
	}

	@GetMapping("/shrek")
	public String shrek() {
		return "Shrek was played by Mike Myers";
	}

	@GetMapping("/donkey")
	public String donkey() {
		return "Donkey was played by Eddie Murphy";
	}

}
