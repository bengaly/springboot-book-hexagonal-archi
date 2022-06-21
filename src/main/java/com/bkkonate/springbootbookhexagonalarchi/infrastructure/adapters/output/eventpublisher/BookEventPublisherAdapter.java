package com.bkkonate.springbootbookhexagonalarchi.infrastructure.adapters.output.eventpublisher;

import com.bkkonate.springbootbookhexagonalarchi.application.ports.output.BookEventPublisher;
import com.bkkonate.springbootbookhexagonalarchi.domain.event.BookCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@RequiredArgsConstructor
public class BookEventPublisherAdapter implements BookEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publishBookCreatedEvent(BookCreatedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
