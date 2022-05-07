package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "TBL_AUDIENCIA")
public class Audiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUDIENCIA")
    private Long id_Audiencia;

    @Column(name = "HORA_INICIO", nullable = false)
    private Time horaInicion;

    @Column(name = "HORA_FIN", nullable = false)
    private Time horaFin;

    @Column(name = "FECHA", nullable = false)
    private Date fecha;

    @Column(name = "LinkAudiencia", nullable = true)
    private String linkAudiencia;

    @ManyToOne
    @JoinColumn(name = "ID_PROCESADO")
    private Procesado procesado;

    @ManyToOne
    @JoinColumn(name = "ID_ABOGADO")
    private Abogado abogado;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_AUDIENCIA")
    private TipoAudiencia tipoAudiencia;

    @ManyToOne
    @JoinColumn(name = "ID_JUEZ")
    private Juez juez;

    @ManyToOne
    @JoinColumn(name = "ID_ORGANO_JURISDICCIONAL")
    private OrganoJurisdiccional organoJurisdiccional;

    public Audiencia() {
    }

    public Audiencia(Long id_Audiencia, Time horaInicion, Time horaFin, Date fecha, String linkAudiencia, Abogado abogado, TipoAudiencia tipoAudiencia, Juez juez, OrganoJurisdiccional organoJurisdiccional) {
        this.id_Audiencia = id_Audiencia;
        this.horaInicion = horaInicion;
        this.horaFin = horaFin;
        this.fecha = fecha;
        this.linkAudiencia = linkAudiencia;
        this.abogado = abogado;
        this.tipoAudiencia = tipoAudiencia;
        this.juez = juez;
        this.organoJurisdiccional = organoJurisdiccional;
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

    public Abogado getAbogado() {
        return abogado;
    }

    public void setAbogado(Abogado abogado) {
        this.abogado = abogado;
    }

    public TipoAudiencia getTipoAudiencia() {
        return tipoAudiencia;
    }

    public void setTipoAudiencia(TipoAudiencia tipoAudiencia) {
        this.tipoAudiencia = tipoAudiencia;
    }

    public Juez getJuez() {
        return juez;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }

    public OrganoJurisdiccional getOrganoJurisdiccional() {
        return organoJurisdiccional;
    }

    public void setOrganoJurisdiccional(OrganoJurisdiccional organoJurisdiccional) {
        this.organoJurisdiccional = organoJurisdiccional;
    }

    @Override
    public String toString() {
        return "Audiencia{" +
                "id_Audiencia=" + id_Audiencia +
                ", horaInicion=" + horaInicion +
                ", horaFin=" + horaFin +
                ", fecha=" + fecha +
                ", linkAudiencia='" + linkAudiencia + '\'' +
                ", abogado=" + abogado +
                ", tipoAudiencia=" + tipoAudiencia +
                ", juez=" + juez +
                ", organoJurisdiccional=" + organoJurisdiccional +
                '}';
    }
}














