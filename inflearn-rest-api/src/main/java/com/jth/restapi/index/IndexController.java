package com.jth.restapi.index;

import com.jth.restapi.events.EventController;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/api")
    public ResourceSupport index() {
        ResourceSupport index = new ResourceSupport();
        index.add(ControllerLinkBuilder.linkTo(EventController.class).withRel("events"));
        return index;
    }

}
