package com.example.inventarioqr.Modelos;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class LectorResponse implements Serializable {


    private String id;
    private String equipo;
    private String serie;
    private String descripcion;
    private String img_qr;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg_qr() {
        return img_qr;
    }

    public void setImg_qr(String img_qr) {
        this.img_qr = img_qr;
    }

    public String getMensage() {
        return mensage;
    }

    @NonNull
    @Override
    public String toString() {
        return "LectorResponse{" +
                "id='" + id + '\'' +
                ", equipo='" + equipo + '\'' +
                ", serie='" + serie + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", img_qr='" + img_qr + '\'' +
                '}';
    }
}
