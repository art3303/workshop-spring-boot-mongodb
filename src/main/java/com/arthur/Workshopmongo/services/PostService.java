package com.arthur.Workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.Workshopmongo.domain.Post;
import com.arthur.Workshopmongo.domain.User;
import com.arthur.Workshopmongo.repository.PostRepository;
import com.arthur.Workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
	}
}