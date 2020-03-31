package org.llamas.readingapp;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends CrudRepository<Page, Integer>{
Optional<Page> findByPageNumber(Integer pageNumber);
//Iterable<Page> findByBook(Book book);
}
