package com.upc.backend_sistemagestionaudiendia.repositorio;

import com.upc.backend_sistemagestionaudiendia.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
