package com.rutasarg.demo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.rutasarg.demo.service.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api-rutas/v1")
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    @PostMapping("/lote")
    public ResponseEntity<Void> guardarLote(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/excel")
    public ResponseEntity<JsonNode> excelJson(@RequestParam MultipartFile archivo) {
        //TODO Refactorizar response cambiar
        return ResponseEntity.ok(visitaService.guardarDatosExcel(archivo));
    }

}
