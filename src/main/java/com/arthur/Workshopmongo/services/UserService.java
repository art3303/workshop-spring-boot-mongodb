package com.arthur.Workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.Workshopmongo.domain.User;
import com.arthur.Workshopmongo.repository.userRepository;

@Service
public class UserService {

	@Autowired
	private userRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}