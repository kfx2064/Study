package com.jth.restapi.events;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Component
public class EventValidator {

    public void validate(EventDto eventDto, Errors errors) throws Exception {
        if(eventDto.getBasePrice() > eventDto.getMaxPrice()
            && eventDto.getMaxPrice() > 0) {
            errors.rejectValue("basePrice", "wrongValue", "Base price is wrong.");
            errors.rejectValue("maxPrice", "wrongValue", "Max price is wrong.");
            errors.reject("wrongPrices", "Value for Prices are wrong.");
        }

        LocalDateTime endEventDateTime = eventDto.getEndEventDateTime();
        if (endEventDateTime.isBefore(eventDto.getBeginEventDateTime()) ||
                endEventDateTime.isBefore(eventDto.getCloseEnrollmentDateTime()) ||
                endEventDateTime.isBefore(eventDto.getBeginEnrollmentDateTime())) {
            errors.rejectValue("endEventDateTime", "wrongValue", "endEventDateTime is wrong.");
        }

        // TODO BeginEventDateTime
        // TODO CloseEnrollmentDateTime
    }

}
