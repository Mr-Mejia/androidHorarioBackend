package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}
