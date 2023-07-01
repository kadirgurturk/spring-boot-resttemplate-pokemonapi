package com.kadirgurturk.PoekmonRestTemplate.service;

import com.kadirgurturk.PoekmonRestTemplate.model.Poke;

import java.util.Optional;

public interface PokeRestService {

    Optional<Poke> findPoke(Long id);
}
