package com.kadirgurturk.PoekmonRestTemplate.controller;

import com.kadirgurturk.PoekmonRestTemplate.advice.excepiton.NotFoundExcepiton;
import com.kadirgurturk.PoekmonRestTemplate.model.Poke;
import com.kadirgurturk.PoekmonRestTemplate.model.PokeList;
import com.kadirgurturk.PoekmonRestTemplate.service.PokeRestService;
import com.kadirgurturk.PoekmonRestTemplate.service.PokeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pokemon/")
public class Controller {

    private PokeService pokeService;

    public Controller(PokeService pokeService) {
        this.pokeService = pokeService;
    }

    @GetMapping("find/")
    public ResponseEntity<?> findPoke(@RequestParam("id") Long id)
    {

        try {
            return ResponseEntity.ok(pokeService.findById(id).get());
        } catch (HttpClientErrorException e) {
            throw new NotFoundExcepiton("This id is not valid"); // Yakalanmış istisnayı tekrar fırlatın
        }
    }

    @GetMapping("list/")
    public ResponseEntity<?> findPoke(@RequestParam("gen") int generation)
    {

       return ResponseEntity.ok(pokeService.findPokeList(generation));
    }

    @GetMapping()
    public ResponseEntity<?> pagingPoke(@RequestParam("gen") int generation, @RequestParam("page") int page,@RequestParam("size") int size)
    {

        return ResponseEntity.ok(pokeService.pagingPoke(generation,page,size));

    }


}
