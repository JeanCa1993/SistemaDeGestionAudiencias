package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.TipoAudiencia;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioTipoAudiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioTipoAudiencia {
    @Autowired
    private RepositorioTipoAudiencia repositorioTipoAudiencia;

    public TipoAudiencia registrarTipoAudiencia(TipoAudiencia tipoAudiencia){
        return repositorioTipoAudiencia.save(tipoAudiencia);
    }

    public List<TipoAudiencia> obtenerTiposAudiencias(){
        return repositorioTipoAudiencia.findAll();
    }
}
