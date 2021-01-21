package org.hdcd.controller.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Setter
@Getter
@ToString
public class Address implements Serializable {

    private static final long serialVersionUID = 8468671803105764880L;

    @NotBlank
    private String postCode;
    @NotBlank
    private String location;
}
