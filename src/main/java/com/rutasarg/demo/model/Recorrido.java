package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "recorrido")
public class Recorrido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecorrido;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Direccion> direccion;
    @OneToOne(cascade = CascadeType.ALL)
    private Chofer chofer;

}
