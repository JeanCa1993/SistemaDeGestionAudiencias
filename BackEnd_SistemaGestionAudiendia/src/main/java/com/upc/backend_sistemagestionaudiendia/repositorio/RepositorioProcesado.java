package com.upc.backend_sistemagestionaudiendia.repositorio;

import com.upc.backend_sistemagestionaudiendia.entidades.Procesado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProcesado extends JpaRepository<Procesado, Long> {
}
