package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    List<Estudiante> getAll();

    //para enviar datos
    void save(Estudiante estudiante);


}

