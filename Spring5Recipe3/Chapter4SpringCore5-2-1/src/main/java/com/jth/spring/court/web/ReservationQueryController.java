package com.jth.spring.court.web;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.jth.spring.court.service.ReservationService;
import com.jth.spring.court.Delayer;
import com.jth.spring.court.domain.Reservation;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {
	
	private final ReservationService reservationService;
	private final TaskExecutor taskExecutor;
	
	public ReservationQueryController(ReservationService reservationService
									, AsyncTaskExecutor taskExecutor) {
		this.reservationService = reservationService;
		this.taskExecutor = taskExecutor;
	}
	
	@GetMapping
	public void setupForm() {
		
	}
	
	@PostMapping
	public Callable<String> submitForm(@RequestParam("courtName") String courtName, Model model) {
		
		return () -> {
			List<Reservation> reservations = java.util.Collections.emptyList();
			
			if(courtName != null) {
				Delayer.randomDelay();
				reservations = reservationService.query(courtName);
			}
			
			model.addAttribute("reservations", reservations);
			
			return "reservationQuery";
		};
		
	}
	
	@GetMapping(params = "courtName")
	public ResponseBodyEmitter find(@RequestParam("courtName") String courtName) {
		
		final ResponseBodyEmitter emitter = new ResponseBodyEmitter();
		
		taskExecutor.execute(() -> {
			Collection<Reservation> reservations = reservationService.query(courtName);
			try {
				for(Reservation reservation : reservations) {
					emitter.send(reservation);
				}
				emitter.complete();
			} catch(IOException e) {
				emitter.completeWithError(e);
			}
		});
		
		return emitter;
	}
	
}
