package com.sergioag13.srpringbootg13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
public class SaludarController {
    @GetMapping
    public String saludar(){
        return "Clase del lunes con G13...";
    }
}
