package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "TBL_PENITENCIARIA")
public class Penitenciaria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PENITENCIARIA")
    private Long id_penitenciaria;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "DIRECCION", nullable = false)
    private String direccion;

    // https://www.youtube.com/watch?v=kuFBlxwsDFc&list=PLvgzXOqVxIfH8ZSLxJLqQenOZw3T-IzUB&index=1
    @ManyToOne// Muchas Penitenciarias para un ubigeo
    @JoinColumn(name = "ID_UBIGEO")
    private Ubigeo ubigeo;


    public Penitenciaria() {
    }

    public Penitenciaria(String nombre, String direccion, Ubigeo ubigeo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubigeo = ubigeo;
    }

    public void setId_penitenciaria(Long id_penitenciaria) {
        this.id_penitenciaria = id_penitenciaria;
    }

    public Long getId_penitenciaria() {
        return id_penitenciaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    @Override
    public String toString() {
        return "Penitenciaria{" +
                "id_penitenciaria=" + id_penitenciaria +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ubigeo=" + ubigeo +
                '}';
    }
}
