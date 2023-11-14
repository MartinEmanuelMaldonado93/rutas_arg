package com.rutasarg.demo.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PaqueteRequestDto {

    private Double peso;
    private Double ancho;
    private Double alto;
    private Double largo;
    private Long items;
    private LocalDateTime fechaIngreso;
    private String codigo;
    @NotNull
    private RemitenteRequestDto remitente;
    @NotNull
    private DestinatarioRequestDto destinatario;

}
