package com.jth.spring.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ReservationNotAvailableException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	private final String courtName;
	private final LocalDate date;
	private final Date utilDate;
	private final int hour;
	
	public ReservationNotAvailableException(String courtName, LocalDate date, int hour) {
		this.courtName = courtName;
		this.date = date;
		this.utilDate = new Date();
		this.hour = hour;
	}
	
	public ReservationNotAvailableException(String courtName, Date date, int hour) {
		this.courtName = courtName;
		this.date = LocalDate.now();
		this.utilDate = date;
		this.hour = hour;
	}

	public String getCourtName() {
		return courtName;
	}

	public Date getDate() {
		return Date.from(this.date.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public int getHour() {
		return hour;
	}

	public Date getUtilDate() {
		return utilDate;
	}
	
}
