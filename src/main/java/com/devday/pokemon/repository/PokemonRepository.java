package com.devday.pokemon.repository;

import com.devday.pokemon.domain.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}