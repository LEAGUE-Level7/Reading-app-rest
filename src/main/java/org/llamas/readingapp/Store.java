package org.llamas.readingapp;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Store {
@Autowired

private BookRepository br;
	@GetMapping("/store")
	Iterable<Book> BookResults(){
		return br.findAll();
	}
	@GetMapping("/store/{title}")
	Optional<Book> titleSearch(@PathVariable String title) {
		return br.findByTitle(title);
	}
	@GetMapping("/store/{author}")
	Iterable<Book> authorSearch(@PathVariable String author) {
		return br.findByAuthor(author);
	}
}
