package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookQueryResponse {
    private Long id;

    private String name;

    private String description;

    private int numberOfPages;
}
