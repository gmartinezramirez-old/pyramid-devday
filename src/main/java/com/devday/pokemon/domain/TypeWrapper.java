package com.devday.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeWrapper {

    private PokemonWrapper[] pokemon;

    public PokemonWrapper[] getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonWrapper[] pokemon) {
        this.pokemon = pokemon;
    }

}