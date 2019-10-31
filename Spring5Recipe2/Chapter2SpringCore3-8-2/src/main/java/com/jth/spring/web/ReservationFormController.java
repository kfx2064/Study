package com.jth.spring.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.jth.spring.domain.Player;
import com.jth.spring.domain.Reservation;
import com.jth.spring.domain.ReservationValidator;
import com.jth.spring.domain.SportType;
import com.jth.spring.service.ReservationService;

@Controller
@RequestMapping("/reservationForm")
@SessionAttributes("reservation")
public class ReservationFormController {
	
	private final ReservationService reservationService;
	private final ReservationValidator validator;
	
	public ReservationFormController(ReservationService reservationService,
									ReservationValidator validator) {
		this.reservationService = reservationService;
		this.validator = validator;
	}
	
	@ModelAttribute("sportTypes")
	public List<SportType> populateSportTypes() {
		return reservationService.getAllSportTypes();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(@RequestParam(required = false, value = "username") String username, Model model) {
		
		Reservation reservation = new Reservation();
		reservation.setPlayer(new Player(username, null));
		model.addAttribute("reservation", reservation);
		
		return "reservationForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("reservation") Reservation reservation
							, BindingResult result, SessionStatus status) {
		
		validator.validate(reservation, result);
		
		if(result.hasErrors()) {
			return "reservationForm";
		} else {
			reservationService.make(reservation);
			status.setComplete();
			return "redirect:reservationSuccess";
		}
		
	}

}
