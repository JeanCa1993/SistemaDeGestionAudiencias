package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Juez;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioJuez;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioJuez {
    @Autowired
    private RepositorioJuez repositorioJuez;

    public Juez RegistrarJuez(Juez juez){
        return repositorioJuez.save(juez);
    }

    public List<Juez> ObtenerJueces(){
        return repositorioJuez.findAll();
    }
}
