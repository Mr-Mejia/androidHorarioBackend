package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Estudiante;
import dev.germantovar.springboot.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService implements IEstudianteService{

    @Autowired
    private EstudianteRepository repository;


    @Override
    public List<Estudiante> getAll(){
        return (List<Estudiante>) repository.findAll();
    }

    @Override
    public void save(Estudiante estudiante) {

        repository.save(estudiante);
    }

}
