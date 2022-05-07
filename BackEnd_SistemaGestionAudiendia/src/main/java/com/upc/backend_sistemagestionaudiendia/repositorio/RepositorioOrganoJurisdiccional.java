package com.upc.backend_sistemagestionaudiendia.repositorio;

import com.upc.backend_sistemagestionaudiendia.entidades.OrganoJurisdiccional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioOrganoJurisdiccional extends JpaRepository<OrganoJurisdiccional,Long> {
}
