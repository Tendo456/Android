package com.example.inventarioqr.Modelos;

import java.io.Serializable;

public class LectorResponse implements Serializable {


    private String id;
    private String equipo;
    private String serie;
    private String marca;
    private String modelo;
    private String descripcion;
    private String usuario;
    private String sede;
    private String mensage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    @Override
    public String toString() {
        return "LectorResponse{" +
                "id='" + id + '\'' +
                ", equipo='" + equipo + '\'' +
                ", serie='" + serie + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", usuario='" + usuario + '\'' +
                ", sede='" + sede + '\'' +
                ", mensage='" + mensage + '\'' +
                '}';
    }
}
