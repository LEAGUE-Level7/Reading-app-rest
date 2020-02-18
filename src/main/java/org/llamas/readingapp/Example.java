package org.llamas.readingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	@GetMapping("/greeting")
	String getPage() {
		return "hello";
	}
}
