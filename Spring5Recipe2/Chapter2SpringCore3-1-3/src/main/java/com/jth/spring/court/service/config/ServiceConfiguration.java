package com.jth.spring.court.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jth.spring.court.service.ReservationService;
import com.jth.spring.court.service.ReservationServiceImpl;

@Configuration
public class ServiceConfiguration {
	
	@Bean
	public ReservationService reservationService() {
		return new ReservationServiceImpl();
	}

}
