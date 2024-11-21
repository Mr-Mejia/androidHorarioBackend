package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Carnet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarnetsRepository extends CrudRepository<Carnet, Long> {
}
