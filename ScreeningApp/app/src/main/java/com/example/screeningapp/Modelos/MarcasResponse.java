package com.example.screeningapp.Modelos;

import java.io.Serializable;

public class MarcasResponse implements Serializable {


    private String id_marcas;
    private String marca;
    private String fecha;
    private String tipo;
    private String estado;
    private String mensaje;

    public String getId_marcas() {
        return id_marcas;
    }

    public void setId_marcas(String id_marcas) {
        this.id_marcas = id_marcas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "MarcasResponse{" +
                "id_marcas='" + id_marcas + '\'' +
                ", marca='" + marca + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
