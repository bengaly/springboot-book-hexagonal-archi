package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence;

import com.bkkonate.springbootbookhexagonalarchi.application.ports.output.BookOutputPort;
import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.entity.BookEntity;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.mapper.BookPersistenceMapper;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.repository.BookRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class BookPersistenceAdapter implements BookOutputPort {

    private final BookRepository bookRepository;
    private final BookPersistenceMapper bookPersistenceMapper;

    @Override
    public Book saveBook(Book book) {
        BookEntity bookEntity = bookPersistenceMapper.toBookEntity(book);
        bookEntity = bookRepository.save(bookEntity);
        return bookPersistenceMapper.toBook(bookEntity);
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        Optional<BookEntity> bookEntity = bookRepository.findById(id);
        if(!bookEntity.isPresent()) {
            return Optional.empty();
        }
        Book book = bookPersistenceMapper.toBook(bookEntity.get());
        return Optional.of(book);
    }
}
