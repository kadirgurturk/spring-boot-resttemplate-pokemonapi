package com.kadirgurturk.PoekmonRestTemplate.controller;

import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import com.kadirgurturk.PoekmonRestTemplate.service.PokeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pokemon")
public class Controller {

    private PokeService pokeService;

    public Controller(PokeService pokeService) {
        this.pokeService = pokeService;
    }

    @GetMapping("findpoke/")
    public ResponseEntity<Poke> findPoke(@RequestParam("id") int id)
    {
        return ResponseEntity.ok(pokeService.findPoke(id));
    }
}
