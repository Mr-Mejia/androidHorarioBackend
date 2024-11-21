package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Asignatura;
import dev.germantovar.springboot.repository.AsignaturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturasService implements IAsignaturasService{

    @Autowired
    private AsignaturasRepository repository;


    @Override
    public List<Asignatura> getAll(){
        return (List<Asignatura>) repository.findAll();
    }

    @Override
    public void save(Asignatura asignatura) {

        repository.save(asignatura);
    }

}
