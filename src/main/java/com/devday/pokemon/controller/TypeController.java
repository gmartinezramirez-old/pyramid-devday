package com.devday.pokemon.controller;

import com.devday.pokemon.domain.Type;
import com.devday.pokemon.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/types")
    public List<Type> allTypes() {
        return apiService.findAll();
    }

    @GetMapping("/types/{id}/pokemons")
    public List<String> getPokemonNamesByType(@PathVariable(value = "id") int id) {
        return apiService.getAllPokemonsByType(id);
    }

}