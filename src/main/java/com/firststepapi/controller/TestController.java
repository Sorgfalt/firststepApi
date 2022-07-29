package com.firststepapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/connectTest")
	public String Test(){
		return "스프링부트 테스트입니다";
	}
}
