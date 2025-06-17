package com.example.bankcardsservice;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bankcardsservice.entity.Bankcard;
import com.example.bankcardsservice.util.CardStatus;

@SpringBootApplication
public class BankCardsServiceApplication {

	
	public static void main(String[] args) {		
//		Bankcard bankcard = new Bankcard();
//		bankcard = new Bankcard(1, "1234567890123456", "Zarubin", new Date(2025-10-31), CardStatus.ACTIVE, 1000.00);
//		System.out.println(bankcard.toString());
		SpringApplication.run(BankCardsServiceApplication.class, args);
		
		
		
	}

}
