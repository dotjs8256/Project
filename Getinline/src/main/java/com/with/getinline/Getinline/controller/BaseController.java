package com.with.getinline.Getinline.controller;

import org.springframework.boot.autoconfigure.web.servlet.JspTemplateAvailabilityProvider;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//ViewController
@Controller
public class BaseController implements ErrorController { 
	@GetMapping("/")
	public String root() {
		return "index";
	}
	
	/*
	 * error mapping을  그냥 사용하면 오류가 발생됨.
	 * Controller에 implements ErrorController를 해줘야지 기존 spring error page 연결을 끊고
	 * 커스텀하여 사용할 수 있음. 
	 * */
	
	@RequestMapping("/error")
	public String error() {
		return "error";
	}
	
	
}
