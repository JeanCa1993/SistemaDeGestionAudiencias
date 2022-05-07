package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Audiencia;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioAudiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioAudiencia {
    @Autowired
    private RepositorioAudiencia repositorioAudiencia;

    public Audiencia registrarAudiencia(Audiencia audiencia){
        return repositorioAudiencia.save(audiencia);
    }

    public List<Audiencia> obtenerAudiencia(){
        return repositorioAudiencia.findAll();
    }

}
