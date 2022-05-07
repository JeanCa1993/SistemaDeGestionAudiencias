package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_ADMINISTRATIVO")
@PrimaryKeyJoinColumn(referencedColumnName = "ID_USUARIO")
public class Administrativo extends Usuario implements Serializable {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ADMINISTRATIVO")
    private Long id_administrativo;
    */
    public Administrativo() {
    }

    public Administrativo(Long id_usuario, String nombres, String apellido_paterno, String apellido_materno, String fecha_nacimiento, char sexo, String dni, String nombre_usuario, String correo1, String correo2, String telefono1, String telefono2, String celular1, String celular2, String celular3) {
        super(id_usuario, nombres, apellido_paterno, apellido_materno, fecha_nacimiento, sexo, dni, nombre_usuario, correo1, correo2, telefono1, telefono2, celular1, celular2, celular3);
    }


}
