package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "programas_academicos")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ProgramaAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_programa_academico ;

    private String nombre_programa_academico;
    private String id_profesor_director ;
    private String estado;

}



