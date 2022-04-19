package com.example.aplicacionwebsimple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {
    @GetMapping("/mensaje")
    public String Mensaje(){
        return("Aplicación web muy simple");
    }
}
