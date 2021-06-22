package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class PlacaResponse implements Serializable {

    private String id_placa;
    private String N_placa;
    private String fechaP;
    private String id_recepcion;
    private String estadoRe;
    private String estadoAl;
    private String estadoEx;
    private String estadoAr;
    private String estadoAm;
    private String mensaje;

    public String getId_placa() {
        return id_placa;
    }

    public void setId_placa(String id_placa) {
        this.id_placa = id_placa;
    }

    public String getN_placa() {
        return N_placa;
    }

    public void setN_placa(String n_placa) {
        N_placa = n_placa;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getId_recepcion() {
        return id_recepcion;
    }

    public void setId_recepcion(String id_recepcion) {
        this.id_recepcion = id_recepcion;
    }

    public String getEstadoRe() {
        return estadoRe;
    }

    public void setEstadoRe(String estadoRe) {
        this.estadoRe = estadoRe;
    }

    public String getEstadoAl() {
        return estadoAl;
    }

    public void setEstadoAl(String estadoAl) {
        this.estadoAl = estadoAl;
    }

    public String getEstadoEx() {
        return estadoEx;
    }

    public void setEstadoEx(String estadoEx) {
        this.estadoEx = estadoEx;
    }

    public String getEstadoAr() {
        return estadoAr;
    }

    public void setEstadoAr(String estadoAr) {
        this.estadoAr = estadoAr;
    }

    public String getEstadoAm() {
        return estadoAm;
    }

    public void setEstadoAm(String estadoAm) {
        this.estadoAm = estadoAm;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "PlacaResponse{" +
                "id_placa='" + id_placa + '\'' +
                ", N_placa='" + N_placa + '\'' +
                ", fechaP='" + fechaP + '\'' +
                ", id_recepcion='" + id_recepcion + '\'' +
                ", estadoRe='" + estadoRe + '\'' +
                ", estadoAl='" + estadoAl + '\'' +
                ", estadoEx='" + estadoEx + '\'' +
                ", estadoAr='" + estadoAr + '\'' +
                ", estadoAm='" + estadoAm + '\'' +
                '}';
    }
}
