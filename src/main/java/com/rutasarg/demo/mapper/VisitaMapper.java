package com.rutasarg.demo.mapper;

import com.rutasarg.demo.dto.request.RequestVisitaDTO;
import com.rutasarg.demo.model.Visita;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {PaqueteMapper.class})
public interface VisitaMapper {

    @Mapping(source = "idVisita", target = "id")
    @Mapping(source = "fechaLote", target = "fechaLote", dateFormat = "yyyy-MM-dd")
    Visita toEntity(RequestVisitaDTO requestVisitaDTO);

    @InheritInverseConfiguration
    RequestVisitaDTO toDto(Visita visita);

    List<Visita> toEntityList(List<RequestVisitaDTO> requestVisitaDTOS);

}
