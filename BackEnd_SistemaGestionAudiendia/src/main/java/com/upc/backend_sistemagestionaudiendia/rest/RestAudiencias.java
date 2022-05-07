package com.upc.backend_sistemagestionaudiendia.rest;

import com.upc.backend_sistemagestionaudiendia.entidades.Audiencia;
import com.upc.backend_sistemagestionaudiendia.negocio.NegocioAudiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class RestAudiencias {
    @Autowired
    private NegocioAudiencia negocioAudiencia;

    @PostMapping("/poderjudicial")
    public Audiencia crearAudiencia(@RequestBody Audiencia audiencia){
        Audiencia a=null;
        try{
            a = negocioAudiencia.registrarAudiencia(audiencia);
        }catch (Exception e){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No se pudo crear Audiencia");
        }
        return a;
    }


}
