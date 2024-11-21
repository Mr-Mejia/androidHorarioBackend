package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Tarea;
import dev.germantovar.springboot.repository.TareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareasService implements ITareasService{

    @Autowired
    private TareasRepository repository;


    @Override
    public List<Tarea> getAll(){
        return (List<Tarea>) repository.findAll();
    }

    @Override
    public void save(Tarea tarea) {

        repository.save(tarea);
    }

}
