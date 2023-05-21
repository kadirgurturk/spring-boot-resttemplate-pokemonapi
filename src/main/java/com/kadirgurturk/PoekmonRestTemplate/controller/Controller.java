package com.kadirgurturk.PoekmonRestTemplate.controller;

import com.kadirgurturk.PoekmonRestTemplate.advice.excepiton.BadRequestExcepiton;
import com.kadirgurturk.PoekmonRestTemplate.advice.excepiton.NotFoundExcepiton;
import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import com.kadirgurturk.PoekmonRestTemplate.service.PokeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
@RequestMapping("api/pokemon")
public class Controller {

    private PokeService pokeService;

    public Controller(PokeService pokeService) {
        this.pokeService = pokeService;
    }

    @GetMapping("findpoke/")
    public Optional<Poke> findPoke(@RequestParam("id") Integer id)
    {



        try {
            return pokeService.findPoke(id);
        } catch (HttpClientErrorException e) {
            throw new NotFoundExcepiton("This id is not valid"); // Yakalanmış istisnayı tekrar fırlatın
        }
    }
}
