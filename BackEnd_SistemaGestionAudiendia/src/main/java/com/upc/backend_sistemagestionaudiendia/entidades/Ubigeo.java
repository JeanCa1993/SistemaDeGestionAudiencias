package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_UBIGEO")
//@Inheritance(strategy = InheritanceType.JOINED) // Herencia
public class Ubigeo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UGIBEO")
    private Long id_ubigeo;
    @Column(name = "DISTRITO", nullable = false)
    private String distrito;
    @Column(name = "PROVINCIA", nullable = false)
    private String provincia;
    @Column(name = "DEPARTAMENTO", nullable = false)
    private String departamento;

    public Ubigeo() {
    }

    public Ubigeo(String distrito, String provincia, String departamento) {
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
    }

    public void setId_ubigeo(Long id_ubigeo) {
        this.id_ubigeo = id_ubigeo;
    }

    public Long getId_ubigeo() {
        return id_ubigeo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Ubigeo{" +
                "id_ubigeo=" + id_ubigeo +
                ", distrito='" + distrito + '\'' +
                ", provincia='" + provincia + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
