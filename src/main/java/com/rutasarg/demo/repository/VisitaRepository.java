package com.rutasarg.demo.repository;

import com.rutasarg.demo.model.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long> {

    List<Visita> findByFechaLote(LocalDate fechaLote);

}
