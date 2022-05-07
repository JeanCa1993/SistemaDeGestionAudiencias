package com.upc.backend_sistemagestionaudiendia.entidades;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_DELITO")
public class Delito implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DELITO")
    private Long id_delito;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Delito() {
    }

    public Delito(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId_delito(Long id_delito) {
        this.id_delito = id_delito;
    }

    public Long getId_delito() {
        return id_delito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Delito{" +
                "id_delito=" + id_delito +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
