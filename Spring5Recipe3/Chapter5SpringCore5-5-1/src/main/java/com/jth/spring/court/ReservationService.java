package com.jth.spring.court;

import reactor.core.publisher.Flux;

public interface ReservationService {
	
	Flux<Reservation> query(String courtName);
	
	Flux<Reservation> findAll();

}
