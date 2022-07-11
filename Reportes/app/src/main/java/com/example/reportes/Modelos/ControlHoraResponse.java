package com.example.reportes.Modelos;

import java.io.Serializable;

public class ControlHoraResponse implements Serializable {

    private String id_tiempos;
    private String id_usuario;
    private String salida;
    private String regreso;
    private String fecha;
    private String nombres;
    private String apelli_paterno;
    private String apelli_materno;
    private String mensaje;

    public String getId_tiempos() {
        return id_tiempos;
    }

    public void setId_tiempos(String id_tiempos) {
        this.id_tiempos = id_tiempos;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getRegreso() {
        return regreso;
    }

    public void setRegreso(String regreso) {
        this.regreso = regreso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "ControlHoraResponse{" +
                "id_tiempos='" + id_tiempos + '\'' +
                ", id_usuario='" + id_usuario + '\'' +
                ", salida='" + salida + '\'' +
                ", regreso='" + regreso + '\'' +
                ", fecha='" + fecha + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apelli_paterno='" + apelli_paterno + '\'' +
                ", apelli_materno='" + apelli_materno + '\'' +
                '}';
    }
}
