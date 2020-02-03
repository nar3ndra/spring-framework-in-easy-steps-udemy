package com.narendra.ticketreservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	@PostConstruct
	public void initialize() {
		System.out.println("you are in initialize method");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("you are in cleanup method");
	}
}
