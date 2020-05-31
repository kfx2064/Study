package com.jth.spring.court.web;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.core.task.AsyncListenableTaskExecutor;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jth.spring.court.Delayer;
import com.jth.spring.court.domain.Reservation;
import com.jth.spring.court.service.ReservationService;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {
	
	private final ReservationService reservationService;
	private final AsyncListenableTaskExecutor taskExecutor;
	
	public ReservationQueryController(ReservationService reservationService
									, AsyncListenableTaskExecutor taskExecutor) {
		this.reservationService = reservationService;
		this.taskExecutor = taskExecutor;
	}
	
	@GetMapping
	public void setupForm() {
		
	}
	
	@PostMapping
	public ListenableFuture<String> submitForm(@RequestParam("courtName") String courtName, Model model) {
		
		return taskExecutor.submitListenable(() -> {
			
			List<Reservation> reservations = java.util.Collections.emptyList();
			
			if(courtName != null) {
				Delayer.randomDelay();
				reservations = reservationService.query(courtName);
			}
			
			model.addAttribute("reservations", reservations);
			
			return "reservationQuery";
			
		});
		
	}
	
}
