package com.rutasarg.demo.service;

import com.rutasarg.demo.dto.request.PaqueteRequestDto;
import com.rutasarg.demo.dto.response.PaqueteResponseDto;
import com.rutasarg.demo.repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaqueteService implements PaqueteServiceInterface {

    @Autowired
    private PaqueteRepository paqueteRepository;

    @Override
    public PaqueteResponseDto agregarPaquete(PaqueteRequestDto paqueteDto) {
        return null;
    }

    @Override
    public PaqueteResponseDto modificarPaquete(PaqueteRequestDto paqueteDto) {
        return null;
    }
}
