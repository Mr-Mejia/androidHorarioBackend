package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.ProgramaAcademico;
import dev.germantovar.springboot.repository.ProgramasAcademicosRepository;
import dev.germantovar.springboot.services.IProgramasAcademicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramaAcademicoController {

    @Autowired
    private IProgramasAcademicosService service;

    @Autowired
    private ProgramasAcademicosRepository repository;

    @GetMapping("listaP")
    public List<ProgramaAcademico> getAll() {return service.getAll();}

    @PostMapping("guardarP")
    public void save(@RequestBody ProgramaAcademico programaAcademico){
        service.save(programaAcademico);

    }

}
