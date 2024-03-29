package com.jth.spring.court.service;

import java.time.LocalDate;
import java.util.List;

import com.jth.spring.court.domain.PeriodicReservation;
import com.jth.spring.court.domain.Reservation;
import com.jth.spring.court.domain.SportType;


public interface ReservationService {
	
	List<Reservation> query(String courtName);
	
	void make(Reservation reservation) throws ReservationNotAvailableException;
	
	List<SportType> getAllSportTypes();
	
	SportType getSportType(int sportTypeId);
	
	List<Reservation> findByDate(LocalDate summaryDate);
	
	void makePeriodic(PeriodicReservation periodicReservation) throws ReservationNotAvailableException;
	
}
