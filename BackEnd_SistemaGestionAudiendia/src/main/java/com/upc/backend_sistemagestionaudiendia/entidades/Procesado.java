package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_PROCESADO")
@PrimaryKeyJoinColumn(referencedColumnName = "ID_USUARIO")
public class Procesado  extends Usuario implements Serializable {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROCESADO")
    private Long id_procesado;
    */

    @ManyToOne
    @JoinColumn(name = "ID_PENITENCIARIA")
    private Penitenciaria penitenciaria;

    @ManyToOne
    @JoinColumn(name = "ID_DELITO")
    private Delito delito;

    public Procesado() {
    }

    public Procesado(Long id_usuario, String nombres, String apellido_paterno, String apellido_materno, String fecha_nacimiento, char sexo, String dni, String nombre_usuario, String correo1, String correo2, String telefono1, String telefono2, String celular1, String celular2, String celular3, Penitenciaria penitenciaria, Delito delito) {
        super(id_usuario, nombres, apellido_paterno, apellido_materno, fecha_nacimiento, sexo, dni, nombre_usuario, correo1, correo2, telefono1, telefono2, celular1, celular2, celular3);
        this.penitenciaria = penitenciaria;
        this.delito = delito;
    }

    public Penitenciaria getPenitenciaria() {
        return penitenciaria;
    }

    public void setPenitenciaria(Penitenciaria penitenciaria) {
        this.penitenciaria = penitenciaria;
    }

    public Delito getDelito() {
        return delito;
    }

    public void setDelito(Delito delito) {
        this.delito = delito;
    }
}
