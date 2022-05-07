package com.upc.verificadoraudiencia.repositorio;

import com.upc.verificadoraudiencia.entidades.Audiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioAudiencia extends JpaRepository<Audiencia, Long> {
}
