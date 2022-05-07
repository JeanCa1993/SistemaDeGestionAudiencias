package com.upc.backend_sistemagestionaudiendia.repositorio;

import com.upc.backend_sistemagestionaudiendia.entidades.Abogado;
import com.upc.backend_sistemagestionaudiendia.entidades.Ubigeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAbogado extends JpaRepository<Abogado, Long> {
}
