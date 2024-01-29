package com.rutasarg.demo.dto.request;

import com.rutasarg.demo.model.Paquete;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestVisitaDTO {

    private Long idVisita;
    private LocalDate fechaLote;
    private String tipoVisita;
    private String direccion;
    private String provincia;
    private String localidad;
    private String latitud;
    private String longitud;
    private String codigoPostal;
    private LocalDate ventanaHorariaDesde;
    private LocalDate ventanaHorariaHasta;
    private LocalTime horaCambioEstado;
    private String estado;
    private String observacion;
    private List<Paquete> paquetes;

}
