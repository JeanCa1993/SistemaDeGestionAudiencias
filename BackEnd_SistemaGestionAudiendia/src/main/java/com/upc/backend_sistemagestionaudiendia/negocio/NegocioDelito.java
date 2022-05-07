package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Delito;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioDelito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioDelito {
    @Autowired
    private RepositorioDelito repositorioDelito;

    public Delito registrarDelito(Delito delito){
        return repositorioDelito.save(delito);
    }

    public List<Delito> obtenerDelitos(){
        return repositorioDelito.findAll();
    }

}
