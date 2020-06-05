package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.IMilkService;

@Controller
@RequestMapping("/milk")
public class MilkController {
	private IMilkService service;
	@GetMapping("/register")
	public String showregister() {
		return "MilkRegisterPage";
	}

}
