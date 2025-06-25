package com.example.bankcardsservice.dao;

import java.util.List;

import com.example.bankcardsservice.entity.Bankcard;
import com.example.bankcardsservice.entity.User;

public interface CardDAO {

	public List<Bankcard> getAllCards();
	
	public List<Bankcard> getMyCards(User user);
	
	public void createCard(Bankcard bankCard);
	
	public Bankcard getBankCard (int id);
	
	public void deleteBankCard(Bankcard bankCard);
	
	public void updateBankCard(Bankcard bankCard);
	
}
