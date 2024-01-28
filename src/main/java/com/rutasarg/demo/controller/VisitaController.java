package com.rutasarg.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-rutas/v1")
public class VisitaController {

    @PostMapping("/lote")
    public ResponseEntity<Void> guardarLote(){


        return ResponseEntity.ok().build();
    }

}
