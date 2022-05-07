package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.Administrativo;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioAdministrativo;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioAdministrativo {
    @Autowired
    private RepositorioAdministrativo repositorioAdministrativo;

    public Administrativo RegistrarAdministrativo(Administrativo admin){
        return repositorioAdministrativo.save(admin);
    }

    public List<Administrativo> ObtenerAdministrativos(){
        return repositorioAdministrativo.findAll();
    }


}
