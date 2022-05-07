package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_CORTE")
public class Corte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CORTE")
    private Long id_corte;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Corte() {
    }

    public Corte(Long id_corte, String descripcion) {
        this.id_corte = id_corte;
        this.descripcion = descripcion;
    }

    public Long getId_corte() {
        return id_corte;
    }

    public void setId_corte(Long id_corte) {
        this.id_corte = id_corte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Corte{" +
                "id_corte=" + id_corte +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
