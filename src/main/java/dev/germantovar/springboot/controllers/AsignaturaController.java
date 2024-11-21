package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Asignatura;
import dev.germantovar.springboot.repository.AsignaturasRepository;
import dev.germantovar.springboot.services.IAsignaturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AsignaturaController {

    @Autowired
    private IAsignaturasService service;

    @Autowired
    private AsignaturasRepository repository;

    @GetMapping("listaA")
    public List<Asignatura> getAll() {return service.getAll();}


    @PostMapping("guardarA")
    public void save(@RequestBody Asignatura asignatura){
        service.save(asignatura);

    }

}
