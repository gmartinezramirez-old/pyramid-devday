package com.devday.pokemon.service;

import com.devday.pokemon.domain.Pokemon;
import com.devday.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    public Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

}