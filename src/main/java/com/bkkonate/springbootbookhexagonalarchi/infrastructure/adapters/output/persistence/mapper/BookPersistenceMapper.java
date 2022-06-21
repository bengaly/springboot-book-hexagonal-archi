package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.mapper;


import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.entity.BookEntity;
import org.mapstruct.Mapper;

@Mapper
public interface BookPersistenceMapper {

    BookEntity toBookEntity(Book book);

    Book toBook(BookEntity bookEntity);
}
