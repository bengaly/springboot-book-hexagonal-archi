package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.config;

import com.bkkonate.springbootbookhexagonalarchi.domain.service.BookService;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.BookPersistenceAdapter;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.eventpublisher.BookEventPublisherAdapter;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.mapper.BookPersistenceMapper;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.repository.BookRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public BookPersistenceAdapter bookPersistenceAdapter(BookRepository bookRepository, BookPersistenceMapper bookPersistenceMapper) {
        return new BookPersistenceAdapter(bookRepository, bookPersistenceMapper);
    }

    @Bean
    public BookEventPublisherAdapter bookEventPublisherAdapter(ApplicationEventPublisher applicationEventPublisher) {
        return new BookEventPublisherAdapter(applicationEventPublisher);
    }

    @Bean
    public BookService bookService(BookPersistenceAdapter bookPersistenceAdapter, BookEventPublisherAdapter bookEventPublisherAdapter) {
        return new BookService(bookPersistenceAdapter, bookEventPublisherAdapter);
    }
}
