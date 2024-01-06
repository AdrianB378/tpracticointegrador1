
package com.todocodeacademy.tpintegrador1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegradorController {
    
    @GetMapping("/convertir/{galones}")
    public String converNafta(@PathVariable double galones) {
                              
          double litros = 3.78541;                  
    
          double cantidad = galones * litros ;
          
          return " La cantidad litros equivalentes a: " + galones + " galones " + " es de " + cantidad + " litros ";
                  
    }
    
}
