package com.narendra.ticketreservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/narendra/ticketreservation/beans.xml");
		TicketReservation t = (TicketReservation) context.getBean("ticket");
		context.registerShutdownHook();
	}
}
