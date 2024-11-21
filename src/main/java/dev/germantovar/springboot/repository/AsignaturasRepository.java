package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Asignatura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturasRepository extends CrudRepository<Asignatura, Long> {
}
