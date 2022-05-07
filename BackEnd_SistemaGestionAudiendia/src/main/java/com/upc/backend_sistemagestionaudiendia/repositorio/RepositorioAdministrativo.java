package com.upc.backend_sistemagestionaudiendia.repositorio;


import com.upc.backend_sistemagestionaudiendia.entidades.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAdministrativo extends JpaRepository<Administrativo, Long> {
}
