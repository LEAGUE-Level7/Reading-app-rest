package org.llamas.readingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	@Autowired
	 private BookRepository bookRepository;

	
	@GetMapping("/greeting")
	String getPage() {
		return "hello";
	}
	@PostMapping("/addbook")
	String postMapping() {
		Book b = new Book();
		b.setTitle("Min Choi");
		b.setAuthor("Eric Park");
		b.setCopyright(1950);
		b.setDescription("Min Choi goes to The League and plays Mafia");
		b.setReviews(23);
		bookRepository.save(b);
		return "success";
	}
//	@GetMapping("/Comp1ex")
//	Book getEricPark() {
//		return new Book()
//	}
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Book> getAllBooks() {
	    // This returns a JSON or XML with the users
	    return bookRepository.findAll();
	  }
}
