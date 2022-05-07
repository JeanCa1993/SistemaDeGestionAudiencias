package com.example.colasjms_adminaudiencias.rest;

import com.example.colasjms_adminaudiencias.entidades.Audiencia;

import com.example.colasjms_adminaudiencias.jms.JmsSolicitudAudiencia;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class AudienciaRest {
    @Autowired
    private JmsSolicitudAudiencia jmsSolicitudAudiencia;

    @PostMapping("/enviar/{mensaje}")
    public String enviar(@PathVariable(value = "mensaje") String mensaje){
       jmsSolicitudAudiencia.send(mensaje);
        return "Ok!";
    }

}
