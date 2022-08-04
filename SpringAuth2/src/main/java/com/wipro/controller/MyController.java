package com.wipro.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {

	@GetMapping("/msg")
	public String message(Principal principal) {
	 return "Hi"+principal.getName()+"Welcome to spring cloud oauth2 example";
	} 
}
