package org.hdcd.devproject.domain;

import lombok.*;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"postCode", "location"})
@ToString
@Embeddable
public class Address {

    @NotBlank
    private String postCode;

    @NotBlank
    private String location;

}
