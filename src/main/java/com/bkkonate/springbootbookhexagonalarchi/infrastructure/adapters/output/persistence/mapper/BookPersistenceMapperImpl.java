package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.mapper;

import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book.BookBuilder;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.entity.BookEntity;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.persistence.entity.BookEntity.BookEntityBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookPersistenceMapperImpl implements BookPersistenceMapper{
    @Override
    public BookEntity toBookEntity(Book book) {
        if ( book == null ) {
            return null;
        }

        BookEntityBuilder bookEntity = BookEntity.builder();

        bookEntity.id( book.getId() );
        bookEntity.name( book.getName() );
        bookEntity.description( book.getDescription() );
        bookEntity.numberOfPages(book.getNumberOfPages());

        return bookEntity.build();
    }

    @Override
    public Book toBook(BookEntity bookEntity) {
        if(bookEntity == null) {
            return null;
        }
        BookBuilder book = Book.builder();
        book.id(bookEntity.getId());
        book.name(bookEntity.getDescription());
        book.description(bookEntity.getDescription());
        book.numberOfPages(bookEntity.getNumberOfPages());

        return book.build();
    }
}
