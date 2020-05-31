package com.jth.spring.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jth.spring.service.ReservationNotAvailableException;

@ControllerAdvice
public class ExceptionHandlingAdvice {
	
	@ExceptionHandler(ReservationNotAvailableException.class)
	public String handle(ReservationNotAvailableException ex) {
		return "reservationNotAvailable";
	}
	
	@ExceptionHandler
	public String handleDefault(Exception e) {
		return "error";
	}

}
