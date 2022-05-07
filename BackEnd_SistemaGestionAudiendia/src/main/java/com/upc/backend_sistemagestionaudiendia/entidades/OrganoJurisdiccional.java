package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_ORGANO_JURISDICCIONAL")
public class OrganoJurisdiccional implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORGANO_JURISDICCIONAL")
    private Long id_organoJurisdiccional;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "DIRECCION", nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name="ID_CORTE")
    private Corte corte;

    @ManyToOne
    @JoinColumn(name = "ID_UBIGEO")
    private Ubigeo ubigeo;

    public OrganoJurisdiccional() {
    }

    public OrganoJurisdiccional(Long id_organoJurisdiccional, String nombre, String direccion, Corte corte, Ubigeo ubigeo) {
        this.id_organoJurisdiccional = id_organoJurisdiccional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.corte = corte;
        this.ubigeo = ubigeo;
    }

    public Long getId_organoJurisdiccional() {
        return id_organoJurisdiccional;
    }

    public void setId_organoJurisdiccional(Long id_organoJurisdiccional) {
        this.id_organoJurisdiccional = id_organoJurisdiccional;
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

    public Corte getCorte() {
        return corte;
    }

    public void setCorte(Corte corte) {
        this.corte = corte;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    @Override
    public String toString() {
        return "OrganoJurisdiccional{" +
                "id_organoJurisdiccional=" + id_organoJurisdiccional +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", corte=" + corte +
                ", ubigeo=" + ubigeo +
                '}';
    }
}
