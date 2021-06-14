package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class RecepcionResponse implements Serializable {

    private String id_recepcion;
    private String fecha;
    private String hora;
    private String n_envio;
    private String q_muestras;
    private String operador;
    private String dni;
    private String estadoRe;
    private String mensaje;

    public String getId_recepcion() {
        return id_recepcion;
    }

    public void setId_recepcion(String id_recepcion) {
        this.id_recepcion = id_recepcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getN_envio() {
        return n_envio;
    }

    public void setN_envio(String n_envio) {
        this.n_envio = n_envio;
    }

    public String getQ_muestras() {
        return q_muestras;
    }

    public void setQ_muestras(String q_muestras) {
        this.q_muestras = q_muestras;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoRe() {
        return estadoRe;
    }

    public void setEstadoRe(String estadoRe) {
        this.estadoRe = estadoRe;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "RecepcionResponse{" +
                "id_recepcion='" + id_recepcion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", n_envio='" + n_envio + '\'' +
                ", q_muestras='" + q_muestras + '\'' +
                ", operador='" + operador + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoRe='" + estadoRe + '\'' +
                '}';
    }
}
