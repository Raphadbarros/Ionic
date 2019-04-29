package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.domain.Categoria;

@Repository
public interface CategoryRepository extends JpaRepository<Categoria, Integer>{

	
}
