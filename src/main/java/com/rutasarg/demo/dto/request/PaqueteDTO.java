package com.rutasarg.demo.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaqueteDTO {

    private Long idPaquete;
    private String remitente;
    private String codigo;
    private String destinatario;
    private String email;
    private String telefono;
    private String referencia;
    private String notaDetalle;

}
