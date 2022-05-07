package com.upc.backend_sistemagestionaudiendia.repositorio;

import com.upc.backend_sistemagestionaudiendia.entidades.Juez;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioJuez extends JpaRepository<Juez, Long> {
}
