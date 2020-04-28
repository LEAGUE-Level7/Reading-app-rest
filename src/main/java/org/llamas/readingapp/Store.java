package org.llamas.readingapp;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Store {

	@GetMapping("/store")
	String searchresults(){
		return "Hello";
	}
	
}
