package com.kadirgurturk.PoekmonRestTemplate.service;

import com.kadirgurturk.PoekmonRestTemplate.advice.excepiton.BadRequestExcepiton;
import com.kadirgurturk.PoekmonRestTemplate.mapper.PokemonMapper;
import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import com.kadirgurturk.PoekmonRestTemplate.model.PokeList;
import com.kadirgurturk.PoekmonRestTemplate.util.Utils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PokeService {

    PokeRestService pokeRestService;
    PokemonMapper pokemonMapper;

    public PokeService(PokeRestService pokeRestService, PokemonMapper pokemonMapper) {
        this.pokeRestService = pokeRestService;
        this.pokemonMapper = pokemonMapper;
    }

    public Optional<Poke> findById(Long id)
    {
        if(id > 1111 || id < 1) throw new BadRequestExcepiton("Id is not valid");
        return pokeRestService.findPoke(id);

    }

    public PokeList findPokeList(Integer gen)
    {

        if(gen > 5 || gen < 1) throw new BadRequestExcepiton("Gen could take only values between 1 and 5");

        var between = Utils.findGenBetweens(gen);

        var pokes = new ArrayList<Poke>();

        for(int i = between[0] ; i < between[1] ; ++i){
            var poke = findById(Long.valueOf(i));

            pokes.add(poke.get());

        }

        return pokemonMapper.toPokeList(pokes);


    }


}
