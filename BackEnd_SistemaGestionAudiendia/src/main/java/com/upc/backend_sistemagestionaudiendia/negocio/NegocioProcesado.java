package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Procesado;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioProcesado;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioProcesado {
    @Autowired
    private RepositorioProcesado repositorioProcesado;

    public Procesado RegistrarProcesado(Procesado procesado){
        return repositorioProcesado.save(procesado);
    }

    public List<Procesado> ObtenerProcesados(){
        return repositorioProcesado.findAll();
    }
}
