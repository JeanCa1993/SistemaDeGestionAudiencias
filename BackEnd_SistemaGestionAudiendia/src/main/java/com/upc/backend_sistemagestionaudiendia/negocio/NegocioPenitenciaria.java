package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Penitenciaria;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioPenitenciaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioPenitenciaria {
    @Autowired
    private RepositorioPenitenciaria repositorioPenitenciaria;

    public Penitenciaria registrarPenitenciaria(Penitenciaria penitenciaria){
        return repositorioPenitenciaria.save(penitenciaria);
    }

    public List<Penitenciaria> obtenerPenitenciarias(){
        return repositorioPenitenciaria.findAll();
    }
}
