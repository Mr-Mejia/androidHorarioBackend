package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "carnets")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Carnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero_carnet;
    private String id_estudiante ;
    private String fecha_expedicion;
    private String fecha_expiracion;

}



