package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.mapper;

import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.request.BookCreateRequest;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookCreateResponse;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookQueryResponse;

public interface BookRestMapper {

    Book toBook(BookCreateRequest bookCreateRequest);

    BookCreateResponse toBookCreateResponse(Book book);

    BookQueryResponse toBookQueryResponse(Book book);
}
