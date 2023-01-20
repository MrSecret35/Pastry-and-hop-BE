package com.tass.microservice.pastryshops.microservicepastryshops.controller;

import com.tass.microservice.pastryshops.microservicepastryshops.model.Pastry;
import com.tass.microservice.pastryshops.microservicepastryshops.service.abstractions.PastryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pastry")
public class PastryController {

    @Autowired
    private PastryService pastryService;

    @GetMapping("/")
    public ResponseEntity<?> getPastries() {
        return new ResponseEntity<>(pastryService.getPastries(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPastrieById(@PathVariable Long id) {
        return new ResponseEntity<>(pastryService.getPastryById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> savePastry(@RequestBody Pastry pastry){
        return new ResponseEntity<>(pastryService.savePastry(pastry), HttpStatus.OK) ;
    }

    @PutMapping("/")
    public ResponseEntity<?> update (@RequestBody Pastry pastry){
        return new ResponseEntity<>(pastryService.savePastry(pastry), HttpStatus.OK) ;
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        pastryService.deletePastry(id); ;
    }
}
