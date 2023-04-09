package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/abc")
public class DemoController {

	@GetMapping("/hello")
	public String goHome() {
		return "admin/index";
	}
	
	@GetMapping("/list")
	public String listPage() {
		return "admin/list";
	}
	
	@GetMapping("/entry")
	public String entryPage() {
		return "admin/entry";
	}
}
