package com.example.bankcardsservice.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bankcardsservice.dao.CardDAO;
import com.example.bankcardsservice.entity.Bankcard;
import com.example.bankcardsservice.entity.User;

import jakarta.persistence.EntityManager;

@Repository
public class CardDAOImpl implements CardDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Bankcard> getAllCards() {
		Session session = entityManager.unwrap(Session.class);
		Query<Bankcard> query = session.createQuery("from Bankcard", Bankcard.class);
		List<Bankcard> allBankCards = query.getResultList();
		return allBankCards;
	}

	@Override
	public List<Bankcard> getMyCards (User user) {
		Session session = entityManager.unwrap(Session.class);
		Query<Bankcard> query = session.createQuery("from Bankcard where holder =: user", Bankcard.class);
		query.setParameter("user", user.getId());
		List<Bankcard> myBankCards = query.getResultList();
		return myBankCards;
	}

	@Override
	public void createCard(Bankcard bankCard) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(bankCard);
	}

	@Override
	public Bankcard getBankCard(int id) {
		Session session = entityManager.unwrap(Session.class);
		Bankcard bankcard = session.get(Bankcard.class, id);
		return bankcard;
	}

	@Override
	public void deleteBankCard(Bankcard bankCard) {
		Session session = entityManager.unwrap(Session.class);
		session.remove(bankCard);		
	}

	@Override
	public void updateBankCard(Bankcard bankCard) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(bankCard);
	}

}
