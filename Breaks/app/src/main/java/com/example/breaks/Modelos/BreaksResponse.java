package com.example.breaks.Modelos;

import java.io.Serializable;

public class BreaksResponse implements Serializable {

    private String id_breaks;
    private String id_personal;
    private String id_programacion;
    private String fecha_break;
    private String hora_break;
    private String cantidad;
    private String encargado;
    private String nombres;
    private String apelli_paterno;
    private String apelli_materno;
    private String mensaje;

    public String getId_breaks() {
        return id_breaks;
    }

    public void setId_breaks(String id_breaks) {
        this.id_breaks = id_breaks;
    }

    public String getId_personal() {
        return id_personal;
    }

    public void setId_personal(String id_personal) {
        this.id_personal = id_personal;
    }

    public String getId_programacion() {
        return id_programacion;
    }

    public void setId_programacion(String id_programacion) {
        this.id_programacion = id_programacion;
    }

    public String getFecha_break() {
        return fecha_break;
    }

    public void setFecha_break(String fecha_break) {
        this.fecha_break = fecha_break;
    }

    public String getHora_break() {
        return hora_break;
    }

    public void setHora_break(String hora_break) {
        this.hora_break = hora_break;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
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
        return "BraksResponse{" +
                "id_breaks='" + id_breaks + '\'' +
                ", id_personal='" + id_personal + '\'' +
                ", id_programacion='" + id_programacion + '\'' +
                ", fecha_break='" + fecha_break + '\'' +
                ", hora_break='" + hora_break + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", encargado='" + encargado + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apelli_paterno='" + apelli_paterno + '\'' +
                ", apelli_materno='" + apelli_materno + '\'' +
                '}';
    }
}
