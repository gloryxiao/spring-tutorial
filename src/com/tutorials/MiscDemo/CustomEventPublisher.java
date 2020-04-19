package com.tutorials.MiscDemo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public ApplicationEventPublisher getPublisher() {
        return publisher;
    }

    public void publish() {
        CustomEvent customEvent = new CustomEvent(this);
        publisher.publishEvent(customEvent);
    }
}
