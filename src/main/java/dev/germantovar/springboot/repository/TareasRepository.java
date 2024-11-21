package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasRepository extends CrudRepository<Tarea, Long> {
}
