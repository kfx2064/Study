package com.jth.spring.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ServerWebExchange;

import com.jth.spring.court.Reservation;
import com.jth.spring.court.ReservationService;

import reactor.core.publisher.Flux;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {
	
	private final ReservationService reservationService;
	
	public ReservationQueryController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public void setupForm() {
		
	}
	
	@PostMapping
	public String submitForm(ServerWebExchange serverWebExchange, Model model) {
		
		Flux<Reservation> reservations = serverWebExchange.getFormData()
											.map(form -> form.get("courtName"))
											.flatMapMany(Flux::fromIterable)
											.concatMap(courtName -> reservationService.query(courtName));
		
		model.addAttribute("reservations", reservations);
		
		return "reservationQuery";
	}

}
