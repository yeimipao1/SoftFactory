package com.SoftFactory.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Hola Mundo";
    }

    @GetMapping("/about")
    public String presentar(){
        return "Me llamo Yeimi";
    }

}
