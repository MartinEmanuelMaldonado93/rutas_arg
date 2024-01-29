package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "paquete")
public class Paquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String remitente;
    private String codigo;
    private String destinatario;
    private String email;
    private String telefono;
    private String referencia; // ver que es! lista hace referencia a un id
    private String notaDetalle;

}
