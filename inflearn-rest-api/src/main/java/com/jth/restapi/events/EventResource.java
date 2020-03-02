package com.jth.restapi.events;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

public class EventResource extends Resource<Event> {

    public EventResource(Event event, Link... links) {
        super(event, links);

        // Resource 안에서 스스로 링크를 추가하는 방법
        add(ControllerLinkBuilder.linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
