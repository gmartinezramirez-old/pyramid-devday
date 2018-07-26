package com.devday.pokemon.controller;

import com.devday.pokemon.domain.Pokemon;
import com.devday.pokemon.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/pokemons")
    public List<Pokemon> allFavoritePokemons() {
        return favoriteService.findAll();
    }

    @PostMapping("/pokemons")
    public Pokemon insertFavoritePokemon(@Valid @RequestBody Pokemon pokemon) {
        return favoriteService.save(pokemon);
    }

}