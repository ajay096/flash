package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {
	
	@GetMapping(value="/test")
	public ResponseEntity<String>test(){
		return new ResponseEntity<>("welcometo springboot",HttpStatus.OK);
		
	}

}
