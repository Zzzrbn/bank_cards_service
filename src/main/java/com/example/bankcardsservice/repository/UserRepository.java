package com.example.bankcardsservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankcardsservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

//	@Repository
//	public interface UserRepo extends JpaRepository<User, Long> 
//	{
		User findByUsername(String username);
	    //Optional<User> findByName(String username);
//	}
	
}
