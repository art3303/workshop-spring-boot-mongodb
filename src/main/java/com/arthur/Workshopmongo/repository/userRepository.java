package com.arthur.Workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arthur.Workshopmongo.domain.User;

@Repository
public interface userRepository extends MongoRepository<User, String>{

	
}
