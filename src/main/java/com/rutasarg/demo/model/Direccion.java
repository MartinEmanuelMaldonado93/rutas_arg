package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "direccion")
public class Direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;
    private String calle;
    private String altura;
    private String piso;
    private String departamento;
    private String codigoPostal;
    private String comentario;
    private String localidad;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Paquete> paquete;
    
}
