package com.kadirgurturk.PoekmonRestTemplate.service;

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

    private PokeService(PokeRestService pokeRestService) {
        this.pokeRestService = pokeRestService;
    }


    public Optional<Poke> findById(Long id)
    {
        return pokeRestService.findPoke(id);
    }

    public List<Poke> findPokeList(Integer gen)
    {
        var between = Utils.findGenBetweens(gen);

        var pokes = new ArrayList<Poke>();

        for(int i = 1 ; i < 151 ; ++i){
            var poke = findById(Long.valueOf(i));

            pokes.add(poke.get());

        }

        return pokes;


    }


}
