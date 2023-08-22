package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {
	
	@GetMapping("/test")
	public String getHomepage() {
		return "This is the HomePage";
	}

}
