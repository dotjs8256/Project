package com.with.getinline.Getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * ResponseBody가 추가된 Controller
 * */
@RestController
@RequestMapping("/api")
public class APIAuthController {

	@GetMapping("/sign-up")
	public String signUp() {
		return "done.";
	}
	
	@GetMapping("/login")
	public String login() {
		return "done.";
	}
}
