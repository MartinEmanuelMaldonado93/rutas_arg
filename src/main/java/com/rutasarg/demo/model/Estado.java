package com.rutasarg.demo.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "estado")
public class Estado {

    //FIXME ver de hacer un enum

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String tipoEstado;
    private String observacion; //FIXME este atributo puede estar en dirección y en paquete
    private LocalDateTime fechaEntrega; //FIXME ver donde agregar

}
