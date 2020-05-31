package com.jth.spring.court;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Reservation {
	
	private String courtName;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	private int hour;
	private Player player;
	private SportType sportType;
	private Date utilDate;
	
	public Reservation() {
		
	}
	
	public Reservation(String courtName, LocalDate date, int hour, Player player, SportType sportType) {
		this.courtName = courtName;
		this.date = date;
		this.hour = hour;
		this.player = player;
		this.sportType = sportType;
	}
	
	public Reservation(String courtName, LocalDate date, int hour, Player player, SportType sportType, Date utilDate) {
		this.courtName = courtName;
		this.date = date;
		this.hour = hour;
		this.player = player;
		this.sportType = sportType;
		this.utilDate = utilDate;
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
	
	public Date getDateAsUtilDate() {
		return Date.from(this.date.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public Date getUtilDate() {
		return Date.from(this.date.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}
	
}
