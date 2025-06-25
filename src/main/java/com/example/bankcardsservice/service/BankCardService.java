package com.example.bankcardsservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankcardsservice.entity.Bankcard;
import com.example.bankcardsservice.entity.User;

@Service
public interface BankCardService {
	
	public List<Bankcard> getAllCards(); //For Admin ONLY
	
	public List<Bankcard> getMyCards(User user);
	
	public void createCard(Bankcard bankCard);
	
	public Bankcard getBankCard (int id);
	
	public void deleteBankCard(Bankcard bankCard);
	
	public void updateBankCard(Bankcard bankCard);

}
