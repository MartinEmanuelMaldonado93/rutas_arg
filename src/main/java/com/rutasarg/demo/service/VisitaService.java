package com.rutasarg.demo.service;

import com.rutasarg.demo.model.Visita;
import com.rutasarg.demo.repository.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class VisitaService implements VisitaInterface{

    private final VisitaRepository visitaRepository;

    @Autowired
    public VisitaService(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }

    @Override
    public void guardarVisita(Visita visita) {
        visitaRepository.save(visita);
    }

    @Override
    public void guardarListaVisitas(List<Visita> visitas) {
        visitaRepository.saveAll(visitas);
    }

    @Override
    public void eliminarVisita(Long idVisita) {
        visitaRepository.deleteById(idVisita);
    }

    @Override
    public Visita buscarVisita(Long idVisita) {
        return visitaRepository.findById(idVisita)
                .orElseThrow();
    }

    @Override
    public List<Visita> listarVisitas(LocalDate fechaLote) {
        return visitaRepository.findByFechaLote(fechaLote);
    }

}
