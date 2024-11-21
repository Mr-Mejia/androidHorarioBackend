package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Asignatura;

import java.util.List;

public interface IAsignaturasService {
    List<Asignatura> getAll();

    //para enviar datos
    void save(Asignatura asignatura);


}

