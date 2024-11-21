package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.ProgramaAcademico;
import dev.germantovar.springboot.repository.ProgramasAcademicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramasAcademicosService implements IProgramasAcademicosService{

    @Autowired
    private ProgramasAcademicosRepository repository;


    @Override
    public List<ProgramaAcademico> getAll(){
        return (List<ProgramaAcademico>) repository.findAll();
    }

    @Override
    public void save(ProgramaAcademico programaAcademico) {

        repository.save(programaAcademico);
    }

}
