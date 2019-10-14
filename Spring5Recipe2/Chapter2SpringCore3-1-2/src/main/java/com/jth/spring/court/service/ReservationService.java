package com.jth.spring.court.service;

import java.util.List;

import com.jth.spring.court.domain.Reservation;

public interface ReservationService {
	
	List<Reservation> query(String courtName);

}
