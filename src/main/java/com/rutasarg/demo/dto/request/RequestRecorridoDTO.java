package com.rutasarg.demo.dto.request;


import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestRecorridoDTO {

    private Long idRecorrido;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private List<RequestVisitaDTO> visitas;
    private RequestChoferDTO chofer;
}
