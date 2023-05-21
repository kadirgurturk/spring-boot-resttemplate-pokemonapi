package com.kadirgurturk.PoekmonRestTemplate.service;

import com.kadirgurturk.PoekmonRestTemplate.model.Poke;

import java.util.Optional;

public interface PokeService {

    Optional<Poke> findPoke(int id);
}
