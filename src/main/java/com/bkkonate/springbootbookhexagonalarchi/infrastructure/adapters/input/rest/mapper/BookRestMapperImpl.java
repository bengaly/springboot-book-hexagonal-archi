package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.mapper;

import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book.BookBuilder;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.request.BookCreateRequest;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookCreateResponse;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookCreateResponse.BookCreateResponseBuilder;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookQueryResponse;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookQueryResponse.BookQueryResponseBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookRestMapperImpl implements BookRestMapper{
    @Override
    public Book toBook(BookCreateRequest bookCreateRequest) {
        if(bookCreateRequest == null){
            return null;
        }
        BookBuilder book = Book.builder();
        book.name(bookCreateRequest.getName());
        book.description(bookCreateRequest.getDescription());
        book.numberOfPages(bookCreateRequest.getNumberOfPages());

        return book.build();
    }

    @Override
    public BookCreateResponse toBookCreateResponse(Book book) {
        if(book == null) {
            return null;
        }
        BookCreateResponseBuilder bookCreateResponse = BookCreateResponse.builder();
        bookCreateResponse.id(book.getId());
        bookCreateResponse.name(book.getName());
        bookCreateResponse.description(book.getDescription());
        bookCreateResponse.numberOfPages(book.getNumberOfPages());

        return bookCreateResponse.build();
    }

    @Override
    public BookQueryResponse toBookQueryResponse(Book book) {
        if(book == null) {
            return null;
        }
        BookQueryResponseBuilder bookQueryResponse = BookQueryResponse.builder();
        bookQueryResponse.id(book.getId());
        bookQueryResponse.name(book.getName());
        bookQueryResponse.description(book.getDescription());
        bookQueryResponse.numberOfPages(book.getNumberOfPages());

        return bookQueryResponse.build();
    }
}
