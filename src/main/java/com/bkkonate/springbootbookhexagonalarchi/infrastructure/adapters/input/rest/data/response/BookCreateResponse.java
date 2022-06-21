package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookCreateResponse {

    private Long id;

    private String name;

    private String description;

    private int numberOfPages;
}
