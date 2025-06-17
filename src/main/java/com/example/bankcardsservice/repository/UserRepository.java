package com.example.bankcardsservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankcardsservice.entity.User;

public interface UserRepository {

	@Repository
	public interface UserRepo extends JpaRepository<User, Long> 
	{
	    Optional<User> findByName(String username);
	}
	
}
