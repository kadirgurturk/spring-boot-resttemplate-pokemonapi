package com.kadirgurturk.PoekmonRestTemplate.mapper;

import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import com.kadirgurturk.PoekmonRestTemplate.model.PokeList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PokemonMapper {

    public PokeList toPokeList(List<Poke> pokes)
    {
        var dto = new PokeList();
        dto.pokes = pokes;

        return dto;
    }

}
