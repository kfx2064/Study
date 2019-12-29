package me.jth.demoinflearnrestapi;

import me.jth.demoinflearnrestapi.events.Event;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class EventTest {

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
        // Given
        String name = "Event";
        String description = "Spring";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        Assertions.assertThat(event.getName()).isEqualTo(name);
        Assertions.assertThat(event.getDescription()).isEqualTo(description);
    }

}
