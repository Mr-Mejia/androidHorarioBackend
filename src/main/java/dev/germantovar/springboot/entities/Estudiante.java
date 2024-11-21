package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCompleto;
    private String tipo_documento;
    private String documento;
    private String correo;
    private String contrasena;
    private String id_carnet ;
    private String id_progama_academico ;

}



