package com.bkkonate.springbootbookhexagonalarchi.application.ports.output;

import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;

import java.util.Optional;

public interface BookOutputPort {

    Book saveBook(Book book);

    Optional<Book> getBookById(Long id);

}
