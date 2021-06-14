package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class AreaResponse implements Serializable {

    private String id_area_limpia;
    private String q_muestras;
    private String f_inicio;
    private String h_inicio;
    private String f_final;
    private String h_final;
    private String promedio;
    private String operador;
    private String dni;
    private String estadoAr;
    private String id_placa;
    private String N_placa;
    private String mensaje;

    public String getId_area_limpia() {
        return id_area_limpia;
    }

    public void setId_area_limpia(String id_area_limpia) {
        this.id_area_limpia = id_area_limpia;
    }

    public String getQ_muestras() {
        return q_muestras;
    }

    public void setQ_muestras(String q_muestras) {
        this.q_muestras = q_muestras;
    }

    public String getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
    }

    public String getH_inicio() {
        return h_inicio;
    }

    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    public String getF_final() {
        return f_final;
    }

    public void setF_final(String f_final) {
        this.f_final = f_final;
    }

    public String getH_final() {
        return h_final;
    }

    public void setH_final(String h_final) {
        this.h_final = h_final;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
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

    public String getEstadoAr() {
        return estadoAr;
    }

    public void setEstadoAr(String estadoAr) {
        this.estadoAr = estadoAr;
    }

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

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "AreaResponce{" +
                "id_area_limpia='" + id_area_limpia + '\'' +
                ", q_muestras='" + q_muestras + '\'' +
                ", f_inicio='" + f_inicio + '\'' +
                ", h_inicio='" + h_inicio + '\'' +
                ", f_final='" + f_final + '\'' +
                ", h_final='" + h_final + '\'' +
                ", promedio='" + promedio + '\'' +
                ", operador='" + operador + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoAr='" + estadoAr + '\'' +
                ", id_placa='" + id_placa + '\'' +
                ", N_placa='" + N_placa + '\'' +
                '}';
    }
}
