package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Carnet;
import dev.germantovar.springboot.repository.CarnetsRepository;
import dev.germantovar.springboot.services.ICarnetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarnetController {

    @Autowired
    private ICarnetsService service;

    @Autowired
    private CarnetsRepository repository;

    @GetMapping("listaC")
    public List<Carnet> getAll() {return service.getAll();}


    @PostMapping("guardarC")
    public void save(@RequestBody Carnet carnet){
        service.save(carnet);

    }

}
