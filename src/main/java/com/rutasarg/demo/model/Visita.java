package com.rutasarg.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "visitas")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisita;

    private LocalDate fechaLote;
    private String tipoVisita; // ver de hacer enum o recibir del cliente
    private String direccion;
    private String provincia; //ver si conviene
    private String localidad; //ver si conviene
    private String latitud;
    private String longitud;
    private String codigoPostal;
    private LocalDate ventanaHorariaDesde;
    private LocalDate ventanaHorariaHasta;
    private LocalTime horaCambioEstado;
    private String estado; // ver de hacer enum - entregado, fallido, cancelado, rechazado
    private String observacion; // detalle particular de visita

    @OneToMany(cascade = CascadeType.ALL)
    private List<Paquete> paquetes;

}
