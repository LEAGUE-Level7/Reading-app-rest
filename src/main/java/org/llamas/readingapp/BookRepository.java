package org.llamas.readingapp;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BookRepository extends CrudRepository<Book, Integer> {
Optional<Book> findByTitle(String title);
Iterable<Book> findByAuthor(String author);

}