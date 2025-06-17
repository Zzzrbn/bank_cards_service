package com.example.bankcardsservice.entity;

import java.util.Date;

import com.example.bankcardsservice.util.CardStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "bankcards")
public class Bankcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "number", nullable = false, unique = true)
	private String number;
	
	@Column(name = "holder")
	private int holder;
	
	@Column(name = "expdate")
	private Date expdate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private CardStatus status;
	
	@Column(name = "balance")
	private double balance;

	

//	public Bankcard(String number, String holder, Date expdate, CardStatus status, double balance) {
//		super();
//		
//		this.number = number;
//		this.holder = holder;
//		this.expdate = expdate;
//		this.status = status;
//		this.balance = balance;
//	}



	
	
	
	
	
}
