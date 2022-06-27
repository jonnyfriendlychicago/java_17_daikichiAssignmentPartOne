package com.jonfriend.daikichiassignmentpartone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/daikichi")
public class HomeController {

	@RequestMapping("")
	public String hello() {
		return "Welcome!"; 
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!"; 
	}
	
	@RequestMapping("/tomorrow")
	public String tommy() {
		return "Tomorrow, an opportunity will arivse, so be sure to be open to new ideas!"; 
	}
	
}
