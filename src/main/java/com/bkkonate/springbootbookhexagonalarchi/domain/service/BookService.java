package com.bkkonate.springbootbookhexagonalarchi.domain.service;

import com.bkkonate.springbootbookhexagonalarchi.application.ports.input.CreateBookUseCase;
import com.bkkonate.springbootbookhexagonalarchi.application.ports.input.GetBookUseCase;
import com.bkkonate.springbootbookhexagonalarchi.application.ports.output.BookEventPublisher;
import com.bkkonate.springbootbookhexagonalarchi.application.ports.output.BookOutputPort;
import com.bkkonate.springbootbookhexagonalarchi.domain.event.BookCreatedEvent;
import com.bkkonate.springbootbookhexagonalarchi.domain.exception.BookNotFound;
import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class BookService implements CreateBookUseCase, GetBookUseCase {

    public final BookOutputPort bookOutputPort;
    public final BookEventPublisher bookEventPublisher;

    @Override
    public Book createBook(Book book) {
        book = bookOutputPort.saveBook(book);
        bookEventPublisher.publishBookCreatedEvent(new BookCreatedEvent(book.getId()));
        return book;
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> book;
        book = bookOutputPort.getBookById(id);
        if(!book.isPresent()) {
            throw new BookNotFound("Book not found with id " + id);
        }
        return book.get();
    }
}
