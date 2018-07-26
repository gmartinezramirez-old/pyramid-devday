package com.devday.pokemon;

import com.devday.pokemon.domain.Pokemon;
import com.devday.pokemon.service.FavoriteService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.any;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class FavoriteServiceTests {

    @Mock
    private Pokemon pokemonMock;

    @InjectMocks
    private FavoriteService favoriteService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnAllNamesOfPokemonsByHisTypes() {
        when(favoriteService.save(pokemonMock)).thenReturn(new Pokemon());
        Pokemon pokemon = new Pokemon();
        assertThat(favoriteService.save(pokemonMock), is(notNullValue()));
    }



}



