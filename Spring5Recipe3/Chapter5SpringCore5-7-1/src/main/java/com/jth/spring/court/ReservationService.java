package com.jth.spring.court;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReservationService {
	
	Flux<Reservation> query(String courtName);
	
	Flux<Reservation> findAll();
	
	Flux<SportType> getAllSportTypes();
	
	Mono<Reservation> make(Reservation reservation);
	
	SportType getSportType(int sportTypeId);

}
