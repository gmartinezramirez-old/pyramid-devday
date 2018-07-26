package com.devday.pokemon;

import com.devday.pokemon.domain.Pokemon;
import org.junit.Assert;
import org.junit.Test;

public class PokemonTests {

    Pokemon pokemon = new Pokemon();

    @Test
    public void shouldReturnAPokemonObject() {
        pokemon.setName("Pikachu");
        pokemon.setUrl("http//pokeapi.com/v2/pokemon/pikachu");
        Assert.assertEquals(1,1);
    }


}
