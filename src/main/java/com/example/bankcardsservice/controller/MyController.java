package com.example.bankcardsservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String mainPage() {
				
		return "index";
		
	}
	
}
