package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Carnet;

import java.util.List;

public interface ICarnetsService {
    List<Carnet> getAll();

    //para enviar datos
    void save(Carnet carnet);


}

