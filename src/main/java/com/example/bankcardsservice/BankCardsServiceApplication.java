package com.example.bankcardsservice;


import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bankcardsservice.entity.Bankcard;
import com.example.bankcardsservice.entity.User;
import com.example.bankcardsservice.util.CardStatus;
import com.example.bankcardsservice.util.UserStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BankCardsServiceApplication {
	


	public static void main(String[] args) {
		
		SpringApplication.run(BankCardsServiceApplication.class, args);
		log.info("LogINFO: Start app "+ (new Date()));

		
		
		User user = new User(1L, "Name", "123", "ROLE_ADMIN", UserStatus.ACTIVE, new ArrayList<Bankcard>());
		Bankcard bankcard = new Bankcard(1, "1234567890123456", user, new Date(), CardStatus.ACTIVE, 1000);
		user.addBankcard(bankcard);
		System.out.println(bankcard.toString());
		System.out.println(user.toString());

		
	}

}
