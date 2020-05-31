package com.jth.spring.court.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jth.spring.court.Reservation;
import com.jth.spring.court.ReservationService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reservations")
public class ReservationRestController {
	
	private final ReservationService reservationService;
	
	public ReservationRestController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public Flux<Reservation> listAll() {
		return reservationService.findAll();
	}
	
	@PostMapping
	public Flux<Reservation> find(@RequestBody Mono<ReservationQuery> query) {
		return query.flatMapMany(q -> reservationService.query(q.getCourtName()));
	}

}
