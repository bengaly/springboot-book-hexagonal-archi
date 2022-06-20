package com.bkkonate.springbootbookhexagonalarchi.application.ports.output;

import com.bkkonate.springbootbookhexagonalarchi.domain.event.BookCreatedEvent;

public interface BookEventPublisher {

    void publishBookCreatedEvent(BookCreatedEvent event);

}
