package com.devday.pokemon.service;

import com.devday.pokemon.domain.Type;
import com.devday.pokemon.domain.TypeWrapper;
import com.devday.pokemon.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ApiService {

    @Autowired
    private TypeRepository typeRepository;

    @Transactional
    @PostConstruct
    public void init() {
        typeRepository.save(new Type(1, "normal"));
        typeRepository.save(new Type(2, "fighting"));
        typeRepository.save(new Type(3, "flying"));
        typeRepository.save(new Type(4, "poison"));
        typeRepository.save(new Type(5, "ground"));
        typeRepository.save(new Type(6, "rock"));
        typeRepository.save(new Type(7, "bug"));
        typeRepository.save(new Type(8, "ghost"));
        typeRepository.save(new Type(9, "steel"));
        typeRepository.save(new Type(10, "fire"));
        typeRepository.save(new Type(11, "water"));
    }

    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    public Type save(Type type) {
        return typeRepository.save(type);
    }

    public List<String> getAllPokemonsByType(int id) throws RestClientException {
        String url = "http://pokeapi.salestock.net/api/v2/type/" + String.valueOf(id);
        ResponseEntity<TypeWrapper> pokemonResponse = responseTypeWrapper(url);
        return getNamesOfPokemons(pokemonResponse);
    }

    private List<String> getNamesOfPokemons(ResponseEntity<TypeWrapper> pokemonResponse) {
        List<String> pokemonNames = new ArrayList<String>();
        for (int i = 0; i < pokemonResponse.getBody().getPokemon().length; i++) {
            pokemonNames.add(pokemonResponse.getBody().getPokemon()[i].getPokemon().getName());
        }
        return pokemonNames;
    }

    private ResponseEntity<TypeWrapper> responseTypeWrapper(String url) {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate template = builder.build();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("User-Agent", "curl/7.49.0");

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<TypeWrapper> pokemonResponse = template.exchange(url, HttpMethod.GET, entity, TypeWrapper.class);
        return pokemonResponse;
    }

}
