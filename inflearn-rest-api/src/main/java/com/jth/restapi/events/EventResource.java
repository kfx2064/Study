package com.jth.restapi.events;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

public class EventResource extends Resource<Event> {

    public EventResource(Event event, Link... links) {
        super(event, links);

        // Resource 안에서 스스로 링크를 추가하는 방법
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
