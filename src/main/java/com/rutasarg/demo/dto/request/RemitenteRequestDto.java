package com.rutasarg.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemitenteRequestDto {

    @NotBlank
    private String nombreTienda;
    @NotBlank
    private String direccion;
    @NotBlank
    private String codigoPostal;
    @NotBlank
    private String localidad;
    @NotBlank
    private String telefono;

}
