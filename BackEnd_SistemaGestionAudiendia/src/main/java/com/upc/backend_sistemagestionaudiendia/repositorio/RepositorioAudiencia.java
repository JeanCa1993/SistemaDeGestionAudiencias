package com.upc.backend_sistemagestionaudiendia.repositorio;

import com.upc.backend_sistemagestionaudiendia.entidades.Audiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAudiencia extends JpaRepository<Audiencia, Long> {
}
