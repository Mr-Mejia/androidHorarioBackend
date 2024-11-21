package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Tarea;
import dev.germantovar.springboot.repository.TareasRepository;
import dev.germantovar.springboot.services.ITareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TareaController {

    @Autowired
    private ITareasService service;

    @Autowired
    private TareasRepository repository;

    @GetMapping("listaT")
    public List<Tarea> getAll() {return service.getAll();}

    @PostMapping("guardarT")
    public void save(@RequestBody Tarea tarea){
        service.save(tarea);

    }

}
