package com.chris.hihuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String hello(@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName)  { 
		
		if (firstName != null && lastName != null) {
			return "Hi " + firstName + " " + lastName;
		}
		
		return "Hi Human!";
	}

}
