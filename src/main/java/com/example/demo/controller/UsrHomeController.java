package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class UsrHomeController {

	@RequestMapping("/usr/home/main")
	public String showMain() {
		return "/usr/home/main";
	}
	
	@RequestMapping("/")
	public String showRoot() {
		return "redirect:usr/home/main";
	}
	
}