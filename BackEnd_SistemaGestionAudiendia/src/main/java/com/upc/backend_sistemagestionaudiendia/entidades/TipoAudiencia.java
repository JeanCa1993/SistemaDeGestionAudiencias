package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;

@Entity
@Table(name = "TBL_TIPO_AUDIENCIA")
public class TipoAudiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_AUDIENCIA")
    private Long id_TipoAudiencia;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    public TipoAudiencia() {
    }

    public TipoAudiencia(Long id_TipoAudiencia, String descripcion) {
        this.id_TipoAudiencia = id_TipoAudiencia;
        this.descripcion = descripcion;
    }

    public Long getId_TipoAudiencia() {
        return id_TipoAudiencia;
    }

    public void setId_TipoAudiencia(Long id_TipoAudiencia) {
        this.id_TipoAudiencia = id_TipoAudiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoAudiencia{" +
                "id_TipoAudiencia=" + id_TipoAudiencia +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
