package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "recorrido")
public class Recorrido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecorrido;

    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Visita> visitas;

    @OneToOne(cascade = CascadeType.ALL)
    private Chofer chofer;

}
