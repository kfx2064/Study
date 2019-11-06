package com.jth.spring.court.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jth.spring.court.service.ReservationNotAvailableException;

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
