package com.kadirgurturk.PoekmonRestTemplate.service;

import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class PokeServiceImp implements PokeService{


    private RestTemplate restTemplate;

    public PokeServiceImp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${app.pokemonapi.url}")
    private String url;


    @Override
    public Optional<Poke> findPoke(int id) {

        var newUrl = url + id;

        return Optional.of(restTemplate.getForObject(newUrl,Poke.class));
    }
}
