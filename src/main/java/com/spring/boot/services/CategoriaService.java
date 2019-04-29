package com.spring.boot.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.boot.domain.Categoria;
import com.spring.boot.repositories.CategoryRepository;

@Service
public class CategoriaService {

	private CategoryRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}
	
	
	
}
