package com.kadirgurturk.PoekmonRestTemplate.service;

import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;



@Service
public class PokeRestServiceImp implements PokeRestService {


    private RestTemplate restTemplate;

    public PokeRestServiceImp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${app.pokemonapi.url}")
    private String url;


    @Override
    public Optional<Poke> findPoke(Long id) {

        var newUrl = url + id;

        return Optional.of(restTemplate.getForObject(newUrl,Poke.class));
    }
}
