package com.email.sender.emailSenderApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {


	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}



	//	Data that you will be sending in the moment that application will start
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("marek_augustyn1@o2.pl", "Test info send from spring boot app", "I just tested backend app to sending emails from the spring boot app");
	}


}
