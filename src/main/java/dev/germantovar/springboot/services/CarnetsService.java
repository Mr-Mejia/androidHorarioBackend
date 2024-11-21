package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Carnet;
import dev.germantovar.springboot.repository.CarnetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarnetsService implements ICarnetsService{

    @Autowired
    private CarnetsRepository repository;


    @Override
    public List<Carnet> getAll(){
        return (List<Carnet>) repository.findAll();
    }

    @Override
    public void save(Carnet carnet) {

        repository.save(carnet);
    }

}
