package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Corte;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioCorte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioCorte {
    @Autowired
    private RepositorioCorte repositorioCorte;

    public Corte RegistrarCorte(Corte corte){
        return repositorioCorte.save(corte);
    }

    public List<Corte> ObtenerCortes(){
        return repositorioCorte.findAll();
    }
}
