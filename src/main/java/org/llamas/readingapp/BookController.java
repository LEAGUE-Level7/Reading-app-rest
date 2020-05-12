package org.llamas.readingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@Autowired
private BookRepository br;
@PostMapping("/createbook/{title}/{author}")
String BookCreation(@PathVariable String title, @PathVariable String author) {
	Book b = new Book();
	b.setTitle(title);
	b.setAuthor(author);
	b.setCopyright(0000);
	b.setDescription("");
	br.save(b);
	return "Min Choi";
}
}
