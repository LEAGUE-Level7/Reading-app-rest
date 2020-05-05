package org.llamas.readingapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("/greeting2")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "privyet " + name;
	}
//	@GetMapping("/books/{id}")
//	  Book one(@PathVariable Integer id) {
//	    return bookRepository.findById(id).get();
//	  }
	@GetMapping("/findbyauthor")
	public Iterable<Book> findbyauthor(@RequestParam(value = "author", defaultValue = "Ankit") String author){
		return bookRepository.findByAuthor(author);
	}
	
	@PostMapping("/addbook")
	String postMapping() {
		Book b = new Book();
		b.setTitle("Min Choi");
		b.setAuthor("Eric Park");
		b.setCopyright(1950);
		b.setDescription("Min Choi goes to The League and plays Mafia");
		bookRepository.save(b);
		return "success";
	}
	@PostMapping("/addbooktwo")
	String addingBook(){
		Book b2 = new Book();
		b2.setTitle("Eli Browne");
		b2.setAuthor("Max Norman");
		b2.setCopyright(940);
		b2.setDescription("The story of a young boy who dropped programming to hit a white ball");
		bookRepository.save(b2);
		return "yeet";
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
