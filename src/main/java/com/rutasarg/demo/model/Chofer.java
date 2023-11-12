package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "chofer")
public class Chofer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChofer;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;

}
