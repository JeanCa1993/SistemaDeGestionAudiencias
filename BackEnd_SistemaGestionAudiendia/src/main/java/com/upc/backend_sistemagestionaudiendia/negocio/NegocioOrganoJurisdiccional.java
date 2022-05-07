package com.upc.backend_sistemagestionaudiendia.negocio;

import com.upc.backend_sistemagestionaudiendia.entidades.OrganoJurisdiccional;
import com.upc.backend_sistemagestionaudiendia.repositorio.RepositorioOrganoJurisdiccional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioOrganoJurisdiccional {
    @Autowired
    private RepositorioOrganoJurisdiccional repositorioOrganoJurisdiccional;

    public OrganoJurisdiccional registrarOrganoJurisdiccional(OrganoJurisdiccional organoJurisdiccional){
        return repositorioOrganoJurisdiccional.save(organoJurisdiccional);
    }

    public List<OrganoJurisdiccional> obtenerOrganosJurisdiccionales(){
        return repositorioOrganoJurisdiccional.findAll();
    }
}
