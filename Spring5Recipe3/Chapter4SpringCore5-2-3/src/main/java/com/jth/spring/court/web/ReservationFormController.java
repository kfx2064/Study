package com.jth.spring.court.web;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.jth.spring.court.domain.Player;
import com.jth.spring.court.domain.Reservation;
import com.jth.spring.court.domain.SportType;
import com.jth.spring.court.service.ReservationService;

@Controller
@RequestMapping("/reservationForm")
@SessionAttributes("reservation")
public class ReservationFormController {
	
	private final ReservationService reservationService;
	
	public ReservationFormController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@ModelAttribute("sportTypes")
	public List<SportType> populateSportTypes() {
		return reservationService.getAllSportTypes();
	}
	
	@GetMapping
	public String setupForm(@RequestParam(required = false, value = "username") String username
							, Model model) {
		Reservation reservation = new Reservation();
		reservation.setPlayer(new Player(username, null));
		
		model.addAttribute("reservation", reservation);
		
		return "reservationForm";
	}
	
	@PostMapping
	public Callable<String> submitForm(
								@ModelAttribute("reservation") @Valid Reservation reservation
								, BindingResult result, SessionStatus status) {
		return () -> {
			if(result.hasErrors()) {
				return "reservationForm";
			} else {
				Thread.sleep(new Random().nextInt(10) * 120);
				reservationService.make(reservation);
				status.setComplete();
				return "redirect:reservationSuccess";
			}
		};
	}
	
	@RequestMapping(value = "/reservationSuccess")
	public String callReservationSuccess() {
		return "reservationSuccess";
	}

}
