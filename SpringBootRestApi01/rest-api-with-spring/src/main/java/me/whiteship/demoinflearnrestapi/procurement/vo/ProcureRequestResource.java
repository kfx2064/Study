package me.whiteship.demoinflearnrestapi.procurement.vo;

import me.whiteship.demoinflearnrestapi.procurement.controller.ProcureRequestController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

public class ProcureRequestResource extends Resource<ProcureRequestVO> {

    public ProcureRequestResource(ProcureRequestVO procureRequestVO, Link... links) {
        super(procureRequestVO, links);
        add(linkTo(ProcureRequestController.class)
                .slash(procureRequestVO.getProcureRequestNo())
                .withSelfRel());
    }
}
