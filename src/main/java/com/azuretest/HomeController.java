package com.azuretest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HomeController {
	
	@GetMapping("/home")
	public String  getLocations() {
		return "Hello application working...";
	}

}
