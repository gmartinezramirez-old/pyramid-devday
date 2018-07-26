package com.devday.pokemon.repository;

import com.devday.pokemon.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TypeRepository extends JpaRepository<Type, Integer> {
}