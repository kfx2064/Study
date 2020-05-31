package com.jth.spring.court.web;

import java.util.Date;

public class ReservationWebException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	private String message;
	private String stack;
	private Date date;
	
	public ReservationWebException(String message, Date date, String stack) {
		this.message = message;
		this.date = date;
		this.stack = stack;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
