package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest;

import com.bkkonate.springbootbookhexagonalarchi.application.ports.input.CreateBookUseCase;
import com.bkkonate.springbootbookhexagonalarchi.application.ports.input.GetBookUseCase;
import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.request.BookCreateRequest;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookCreateResponse;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response.BookQueryResponse;
import com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.mapper.BookRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class BookRestAdapter {
    private final CreateBookUseCase createBookUseCase;

    private final GetBookUseCase getBookUseCase;

    private final BookRestMapper bookRestMapper;

    @PostMapping(value = "/books")
    public ResponseEntity<BookCreateResponse> createBook(@RequestBody @Valid BookCreateRequest bookCreateRequest){
        // Request to domain
        Book book = bookRestMapper.toBook(bookCreateRequest);

        book = createBookUseCase.createBook(book);

        // Domain to response
        return new ResponseEntity<>(bookRestMapper.toBookCreateResponse(book), HttpStatus.CREATED);
    }

    @GetMapping(value = "/books/{id}")
    public ResponseEntity<BookQueryResponse> getBook(@PathVariable Long id){
        Book book = getBookUseCase.getBookById(id);
        return new ResponseEntity<>(bookRestMapper.toBookQueryResponse(book), HttpStatus.OK);
    }
}
