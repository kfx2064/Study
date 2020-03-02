package com.jth.restapi.common;

import com.jth.restapi.events.EventController;
import com.jth.restapi.index.IndexController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.validation.Errors;

public class ErrorsResource extends Resource<Errors> {

    public ErrorsResource(Errors content, Link... links) {
        super(content, links);
        add(ControllerLinkBuilder.linkTo(IndexController.class).withRel("index"));
    }
}
