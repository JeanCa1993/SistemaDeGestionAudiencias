package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Abogado;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioAbogado;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioAbogado {
    @Autowired
    private RepositorioAbogado repositorioAbogado;

    public Abogado RegistrarAbogado(Abogado abogado){
        return repositorioAbogado.save(abogado);
    }

    public List<Abogado> ObtenerAbogados(){
        return repositorioAbogado.findAll();
    }

}
