package br.com.abrigodeanimais.controllers;

import br.com.abrigodeanimais.domain.Animal;
import br.com.abrigodeanimais.domain.Raca;
import br.com.abrigodeanimais.repository.IAnimalRepository;
import br.com.abrigodeanimais.repository.IRacaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/raca")
public class RacaController {
    IRacaRepository racaRepository;

    public RacaController(IRacaRepository racaRepository){
        this.racaRepository = racaRepository;
    }

    @PostMapping
    public ResponseEntity<Raca> createAnimal (@RequestBody Raca raca){
        Raca racaDB = racaRepository.save(raca);
        return new ResponseEntity<>(racaDB, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Raca>> getAll (){
        List<Raca> racasDB = racaRepository.findAll();
        return new ResponseEntity<>(racasDB, HttpStatus.OK);
    }
}
