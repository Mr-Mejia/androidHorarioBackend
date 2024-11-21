package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Tarea;

import java.util.List;

public interface ITareasService {
    List<Tarea> getAll();

    //para enviar datos
    void save(Tarea tarea);


}

