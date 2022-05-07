package com.upc.backend_sistemagestionaudiendia.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_USUARIO")
    private Long id_usuario;

    @Column(name = "NOMBRE", nullable = false)
    private String nombres;
    @Column(name = "APELLIDO_PATERNO", nullable = false)
    private String apellido_paterno;
    @Column(name = "APELLIDO_MATERNO", nullable = false)
    private String apellido_materno;

    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private String fecha_nacimiento;
    @Column(name = "SEXO", nullable = false)
    private char sexo;

    @Column(name="DNI",unique = true, nullable = false)
    private String dni;

    @Column(name = "NOMRE_USUARIO", nullable = false)
    private String nombre_usuario;

    @Column(name = "CORREO_1", nullable = true)
    private String correo1;
    @Column(name = "CORREO_2", nullable = true)
    private String correo2;
    @Column(name = "TELEFONO_1", nullable = true)
    private String telefono1;
    @Column(name = "TELEFONO_2", nullable = true)
    private String telefono2;
    @Column(name = "CELULAR_1", nullable = true)
    private String celular1;
    @Column(name = "CELULAR_2", nullable = true)
    private String celular2;
    @Column(name = "CELULAR_3", nullable = true)
    private String celular3;


    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombres, String apellido_paterno, String apellido_materno, String fecha_nacimiento, char sexo, String dni, String nombre_usuario, String correo1, String correo2, String telefono1, String telefono2, String celular1, String celular2, String celular3) {
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.dni = dni;
        this.nombre_usuario = nombre_usuario;
        this.correo1 = correo1;
        this.correo2 = correo2;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.celular3 = celular3;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getCelular3() {
        return celular3;
    }

    public void setCelular3(String celular3) {
        this.celular3 = celular3;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nombres='" + nombres + '\'' +
                ", apellido_paterno='" + apellido_paterno + '\'' +
                ", apellido_materno='" + apellido_materno + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", sexo=" + sexo +
                ", dni='" + dni + '\'' +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", correo1='" + correo1 + '\'' +
                ", correo2='" + correo2 + '\'' +
                ", telefono1='" + telefono1 + '\'' +
                ", telefono2='" + telefono2 + '\'' +
                ", celular1='" + celular1 + '\'' +
                ", celular2='" + celular2 + '\'' +
                ", celular3='" + celular3 + '\'' +
                '}';
    }
}
