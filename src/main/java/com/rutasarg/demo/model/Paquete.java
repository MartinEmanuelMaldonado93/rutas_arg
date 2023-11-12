package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "paquete")
public class Paquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaquete;
    private Double peso;
    private Double ancho;
    private Double alto;
    private Double largo;
    private Long items;
    private LocalDateTime fechaIngreso;
    private String codigo;
    @OneToOne(cascade = CascadeType.ALL)
    private Remitente remitente;
    @OneToOne(cascade = CascadeType.ALL)
    private Destinatario destinatario;
    @OneToOne(cascade = CascadeType.ALL)
    private Estado estado;

}
