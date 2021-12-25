package com.example.breaks.Modelos;

import java.io.Serializable;

public class PersonalResponse implements Serializable {

    private String id_personal;
    private String nombres;
    private String apelli_paterno;
    private String apelli_materno;
    private String DNI;
    private String correo;
    private String rol;
    private String estado;
    private String mensaje;

    public String getId_personal() {
        return id_personal;
    }

    public void setId_personal(String id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApelli_paterno() {
        return apelli_paterno;
    }

    public void setApelli_paterno(String apelli_paterno) {
        this.apelli_paterno = apelli_paterno;
    }

    public String getApelli_materno() {
        return apelli_materno;
    }

    public void setApelli_materno(String apelli_materno) {
        this.apelli_materno = apelli_materno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "PersonalResponse{" +
                "id_personal='" + id_personal + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apelli_paterno='" + apelli_paterno + '\'' +
                ", apelli_materno='" + apelli_materno + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", rol='" + rol + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
