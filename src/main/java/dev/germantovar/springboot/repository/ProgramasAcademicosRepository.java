package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.ProgramaAcademico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramasAcademicosRepository extends CrudRepository<ProgramaAcademico, Long> {
}
