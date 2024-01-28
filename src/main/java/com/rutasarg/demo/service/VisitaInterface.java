package com.rutasarg.demo.service;

import com.rutasarg.demo.model.Visita;

import java.time.LocalDate;
import java.util.List;

public interface VisitaInterface {

    void guardarVisita(Visita visita);
    void guardarListaVisitas(List<Visita> visitas);
    void eliminarVisita(Long idVisita);
    Visita buscarVisita(Long idVisita);
    List<Visita> listarVisitas(LocalDate fechaLote);

}
