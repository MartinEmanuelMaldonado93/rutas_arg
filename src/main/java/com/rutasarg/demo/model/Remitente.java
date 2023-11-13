package com.rutasarg.demo.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Getter
@Setter
@Entity(name = "remitente")
public class Remitente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRemitente;
    private String nombreTienda;
    private String direccion;
    private String codigoPostal;
    private String localidad;
    private String telefono;

}
