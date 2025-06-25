package com.example.bankcardsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankcardsservice.dao.CardDAO;
import com.example.bankcardsservice.entity.Bankcard;
import com.example.bankcardsservice.entity.User;


@Service
public class BankCardServiceImpl implements BankCardService
{
	@Autowired
	private CardDAO cardDAO;

	@Override
	public List<Bankcard> getMyCards(User user) {
		return cardDAO.getMyCards(user);
	}

	@Override
	public void createCard(Bankcard bankCard) {
		cardDAO.createCard(bankCard);		
	}

	@Override
	public Bankcard getBankCard(int id) {
		return cardDAO.getBankCard(id);
	}
	
	@Override
	public void deleteBankCard(Bankcard bankCard) {
				
	}

	@Override
	public void updateBankCard(Bankcard bankCard) {
		cardDAO.updateBankCard(bankCard);
		
	}

	@Override
	public List<Bankcard> getAllCards() {
		return cardDAO.getAllCards();
	}

}
