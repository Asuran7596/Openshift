package com.Openshift.spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OpenShift {
	@GetMapping("/Openshift") 
	public String Welcome()
	{
		
		return "welcome to openshift";
	}
	
	@GetMapping("/Openshift/{input}")
	public String Message(@PathVariable String input)
	
	{
	return "hi  "+  input +  "  ur aplication deployed success";	
	}

}
