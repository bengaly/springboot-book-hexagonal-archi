package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.customizedexception.data.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ExceptionResponse {
    private LocalDateTime date;

    private String message;

    private List<String> details;
}
