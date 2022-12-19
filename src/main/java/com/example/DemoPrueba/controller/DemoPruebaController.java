package com.example.DemoPrueba.controller;

import com.example.DemoPrueba.service.DemoPruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/demo" )

//se invoca como GET en postman y asi localhost:8080/divisors/10

public class DemoPruebaController {
    private final DemoPruebaService demoPruebaService;

    public DemoPruebaController(@Autowired DemoPruebaService demoPruebaService) {
        this.demoPruebaService = demoPruebaService;
    }

 /*   @GetMapping("/{id}") //carga desde el load un cliente por id
    @ResponseBody
    public ResponseEntity<DemoPruebaResponse> calcular(@PathVariable DemoPruebaRequest pdr) {
        return ResponseEntity.ok(demoPruebaService.calculatedResult(pdr));
    }

  */

 /*   @GetMapping//("/{id}") //carga el id en la url
    @ResponseBody
    public ResponseEntity<DemoPruebaResponse> calcular(@RequestBody DemoPruebaRequest id) {
        return ResponseEntity.ok(demoPruebaService.calculatedResult(id));
    }*/


    @PostMapping //no puedo enviar nada en la url
    @ResponseBody
    public ResponseEntity<DemoPruebaResponse> calculatedResult(@RequestBody DemoPruebaRequest id) {
        return ResponseEntity.ok(demoPruebaService.calculatedResult(id));
    }

}