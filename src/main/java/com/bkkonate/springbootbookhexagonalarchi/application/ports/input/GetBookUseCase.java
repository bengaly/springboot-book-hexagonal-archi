package com.bkkonate.springbootbookhexagonalarchi.application.ports.input;

import com.bkkonate.springbootbookhexagonalarchi.domain.model.Book;

public interface GetBookUseCase {

    Book getBookById(Long id);

}
