package com.example.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstPage {
	
	@RequestMapping("/")
	public String login() {
		return "admin/login";
	}
	
	@RequestMapping("/index.php")
	public String index(HttpServletRequest request) {
		Cookie[] cookies=request.getCookies();
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("id")) {
					return "student/index";
				}
			}	
		}			
			return "admin/login";
	}
}
