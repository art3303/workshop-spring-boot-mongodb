package com.arthur.Workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arthur.Workshopmongo.domain.Post;
import com.arthur.Workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
}
