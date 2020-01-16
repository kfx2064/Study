package com.jth.restapi.events;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Inflearn Spring REST API")
                .description("REST API development with Spring")
                .build();
        Assertions.assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {

        String name = "Event";
        String description = "Spring";

        Event event = new Event();

        event.setName(name);
        event.setDescription(description);

        Assertions.assertThat(event.getName()).isEqualTo(name);
        Assertions.assertThat(event.getDescription()).isEqualTo(description);
    }

}