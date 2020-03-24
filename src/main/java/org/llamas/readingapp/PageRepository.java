package org.llamas.readingapp;

import java.util.Optional;

public interface PageRepository {
Optional<Page> findByPageNumber(Integer pageNumber);
Iterable<Page> findByBook(Book book);
}
