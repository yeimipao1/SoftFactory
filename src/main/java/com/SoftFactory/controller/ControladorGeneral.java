package com.SoftFactory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorGeneral {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> saludar(){
        return new ResponseEntity<>("Hola Mundo, HttpStatus.OK");


    }

}
