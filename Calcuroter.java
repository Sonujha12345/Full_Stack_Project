package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calcuroter {

	@PostMapping("/cal")
	public String getCalculater(@RequestParam String Name,@RequestParam Double n1,@RequestParam Double n2,
		@RequestParam Double n3,@RequestParam Double n4,@RequestParam Double n5) {
		  Double average=(n1+n2+n3+n4+n5)/5;
		  String response = "Student: " + Name + ", Average: " + average;
				return response;
		
	}

}
