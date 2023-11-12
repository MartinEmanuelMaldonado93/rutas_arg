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
    private Long idDestinatario;
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String telefono;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Paquete> paquete;
    
}
