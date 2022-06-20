package com.bkkonate.springbootbookhexagonalarchi.domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Book {
    private Long id;
    private String name;
    private String description;
    private int numberOfPages;
}
