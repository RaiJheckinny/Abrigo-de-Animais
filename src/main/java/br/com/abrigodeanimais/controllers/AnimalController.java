package br.com.abrigodeanimais.controllers;

import br.com.abrigodeanimais.domain.Animal;
import br.com.abrigodeanimais.repository.IAnimalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    IAnimalRepository animalRepository;

    public AnimalController(IAnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    @PostMapping
    public ResponseEntity<Animal> createAnimal (@RequestBody Animal animal){
        Animal animalDB = animalRepository.save(animal);
        return new ResponseEntity<>(animalDB, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAll (){
        List<Animal> animaisDB = animalRepository.findAll();
        return new ResponseEntity<>(animaisDB, HttpStatus.OK);
    }
}
