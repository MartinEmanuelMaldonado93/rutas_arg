package com.rutasarg.demo.service;

import com.rutasarg.demo.dto.request.PaqueteRequestDto;
import com.rutasarg.demo.dto.response.PaqueteResponseDto;

public interface PaqueteServiceInterface {

    PaqueteResponseDto agregarPaquete(PaqueteRequestDto paqueteDto);
    PaqueteResponseDto modificarPaquete(PaqueteRequestDto paqueteDto);

}
