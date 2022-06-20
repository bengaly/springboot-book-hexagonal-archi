package com.bkkonate.springbootbookhexagonalarchi.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookCreatedEvent {
    private Long id;
    private LocalDateTime date;

    public BookCreatedEvent(Long id) {
        this.id = id;
        this.date = LocalDateTime.now();
    }
}
