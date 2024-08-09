package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {

	@RequestMapping("usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕";
	}
	
	@RequestMapping("usr/home/main")
	@ResponseBody
	public String showMain2() {
		return "잘가";
	}
	
	@RequestMapping("usr/home/main")
	@ResponseBody
	public int showMain3() {
		int a = 1;
		int b = 2;
		
		return a + b;
	}

}
