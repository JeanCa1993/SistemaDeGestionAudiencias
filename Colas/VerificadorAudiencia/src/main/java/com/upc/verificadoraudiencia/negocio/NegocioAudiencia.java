package com.upc.verificadoraudiencia.negocio;

import com.upc.verificadoraudiencia.entidades.Audiencia;
import com.upc.verificadoraudiencia.repositorio.RepositorioAudiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class NegocioAudiencia {
    @Autowired
    private RepositorioAudiencia repositorioAudiencia;

    @Transactional
    public Audiencia grabar(Audiencia audiencia){
        return repositorioAudiencia.save(audiencia);
    }
}
