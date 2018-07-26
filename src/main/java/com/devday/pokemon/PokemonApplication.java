package com.devday.pokemon;

import com.devday.pokemon.domain.TypeWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PokemonApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

    /*
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            String url = "http://pokeapi.salestock.net/api/v2/type/3";

            RestTemplateBuilder builder = new RestTemplateBuilder();
            RestTemplate template = builder.build();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("User-Agent", "curl/7.49.0");

            HttpEntity<String> entity = new HttpEntity<String>(headers);

            ResponseEntity<TypeWrapper> pokemonResponse = template.exchange(url, HttpMethod.GET, entity, TypeWrapper.class);

            List<String> pokemonNames = new ArrayList<String>();

            for (int i = 0; i < pokemonResponse.getBody().getPokemon().length; i++) {
                pokemonNames.add(pokemonResponse.getBody().getPokemon()[i].getPokemon().getName());
            }

            System.out.println(pokemonNames);
        };
    }
    */

}
