package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.rest.data.request;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookCreateRequest {
    @NotEmpty(message = "Name may not be empty")
    private String name;

    @NotEmpty(message = "Description may not be empty")
    private String description;

    @Min(value = 5, message = "A Book should have 5 or more than 5 pages")
    @Max(value = 300, message = "A Book should not have more than 300 pages")
    private int numberOfPages;
}
