package com.rutasarg.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioRequestDto {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String documento;
    @NotBlank
    private String telefono;
    @NotBlank
    private String email;

}
