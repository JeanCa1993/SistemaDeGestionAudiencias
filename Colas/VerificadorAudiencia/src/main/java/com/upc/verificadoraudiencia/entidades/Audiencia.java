package com.upc.verificadoraudiencia.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "TBL_AUDIENCIA")
public class Audiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Audiencia;

    private Time horaInicion;

    private Time horaFin;

    private Date fecha;

    private String linkAudiencia;

    private Long id_procesado;

    private Long id_abogado;

    private Long id_tipoAudiencia;

    private Long id_juez;

    private Long id_organoJurisdiccional;

    public Audiencia() {
    }

    public Audiencia(Long id_Audiencia, Time horaInicion, Time horaFin, Date fecha, String linkAudiencia, Long id_procesado, Long id_abogado, Long id_tipoAudiencia, Long id_juez, Long id_organoJurisdiccional) {
        this.id_Audiencia = id_Audiencia;
        this.horaInicion = horaInicion;
        this.horaFin = horaFin;
        this.fecha = fecha;
        this.linkAudiencia = linkAudiencia;
        this.id_procesado = id_procesado;
        this.id_abogado = id_abogado;
        this.id_tipoAudiencia = id_tipoAudiencia;
        this.id_juez = id_juez;
        this.id_organoJurisdiccional = id_organoJurisdiccional;
    }

    public Long getId_Audiencia() {
        return id_Audiencia;
    }

    public void setId_Audiencia(Long id_Audiencia) {
        this.id_Audiencia = id_Audiencia;
    }

    public Time getHoraInicion() {
        return horaInicion;
    }

    public void setHoraInicion(Time horaInicion) {
        this.horaInicion = horaInicion;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLinkAudiencia() {
        return linkAudiencia;
    }

    public void setLinkAudiencia(String linkAudiencia) {
        this.linkAudiencia = linkAudiencia;
    }

    public Long getId_procesado() {
        return id_procesado;
    }

    public void setId_procesado(Long id_procesado) {
        this.id_procesado = id_procesado;
    }

    public Long getId_abogado() {
        return id_abogado;
    }

    public void setId_abogado(Long id_abogado) {
        this.id_abogado = id_abogado;
    }

    public Long getId_tipoAudiencia() {
        return id_tipoAudiencia;
    }

    public void setId_tipoAudiencia(Long id_tipoAudiencia) {
        this.id_tipoAudiencia = id_tipoAudiencia;
    }

    public Long getId_juez() {
        return id_juez;
    }

    public void setId_juez(Long id_juez) {
        this.id_juez = id_juez;
    }

    public Long getId_organoJurisdiccional() {
        return id_organoJurisdiccional;
    }

    public void setId_organoJurisdiccional(Long id_organoJurisdiccional) {
        this.id_organoJurisdiccional = id_organoJurisdiccional;
    }
}
