package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.input.eventlistener;

import com.bkkonate.springbootbookhexagonalarchi.domain.event.BookCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BookEventListenerAdapter {

    @EventListener
    public void handle(BookCreatedEvent event){
        log.info("Book created with id " + event.getId() + " at " + event.getDate());
    }
}
