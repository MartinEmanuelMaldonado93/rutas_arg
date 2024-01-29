package com.rutasarg.demo.mapper;

import com.rutasarg.demo.dto.request.PaqueteDTO;
import com.rutasarg.demo.model.Paquete;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaqueteMapper {

    @Mapping(source = "idPaquete", target = "id")
    Paquete dtoToEntity(PaqueteDTO paqueteDTO);

    @InheritInverseConfiguration
    PaqueteDTO toDto(Paquete paquete);

    List<Paquete> toEntityList(List<PaqueteDTO> paqueteDTOS);
}
