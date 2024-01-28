package com.rutasarg.demo.service;

import com.rutasarg.demo.model.Chofer;

import java.time.LocalDate;

public interface ChoferInterface {
    void guardarChofer(Chofer chofer);
    void eliminarChofer(Long idChofer);
    void buscarChofer(Long idChofer);
    void listarChoferes();
}
