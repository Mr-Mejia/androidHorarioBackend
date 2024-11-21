package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Estudiante;
import dev.germantovar.springboot.repository.EstudianteRepository;
import dev.germantovar.springboot.services.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private IEstudianteService service;

    @Autowired
    private EstudianteRepository repository;

    @GetMapping("listaE")
    public List<Estudiante> getAll() {return service.getAll();}

    @GetMapping("loginE")
    public boolean getEst(@RequestBody Estudiante estudiante) {
        return service.equals(estudiante);
    }

    @PostMapping("guardarEstudiante")
    public void save(@RequestBody Estudiante estudiante){
        service.save(estudiante);

    }


}
