package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.ProgramaAcademico;

import java.util.List;

public interface IProgramasAcademicosService {
    List<ProgramaAcademico> getAll();

    //para enviar datos
    void save(ProgramaAcademico asignatura);


}

