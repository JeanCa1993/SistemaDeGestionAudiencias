package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Ubigeo;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioUbigeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioUbigeo {
    @Autowired
    private RepositorioUbigeo repositorioUbigeo;

    public Ubigeo registrarUbigeo(Ubigeo ubigeo){
        return repositorioUbigeo.save(ubigeo);
    }

    public List<Ubigeo> obtenerUbigeos(){
        return repositorioUbigeo.findAll();
    }
}
