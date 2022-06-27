package com.jonfriend.daikichiassignmentpartone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")
public class HomeController {

	@RequestMapping("")
	public String hello() {
		return "hello daikichi"; 
	}
	
	@RequestMapping("/world")
	public String world() {
		return "konichiwa"; 
	}
	
}
