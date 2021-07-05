package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class AlicuotadoResponse implements Serializable {


    private String id_alicuotado;
    private String q_muestras;
    private String f_inicio;
    private String h_inicio;
    private String f_final;
    private String h_final;
    private String promedio;
    private String operador;
    private String dni;
    private String estadoAl;
    private String id_placa;
    private String N_placa;
    private String N_corrida;
    private String mensaje;

    public String getId_alicuotado() {
        return id_alicuotado;
    }

    public void setId_alicuotado(String id_alicuotado) {
        this.id_alicuotado = id_alicuotado;
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

    public String getEstadoAl() {
        return estadoAl;
    }

    public void setEstadoAl(String estadoAl) {
        this.estadoAl = estadoAl;
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

    public String getN_corrida() {
        return N_corrida;
    }

    public void setN_corrida(String n_corrida) {
        N_corrida = n_corrida;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "AlicuotadoResponse{" +
                "id_alicuotado='" + id_alicuotado + '\'' +
                ", q_muestras='" + q_muestras + '\'' +
                ", f_inicio='" + f_inicio + '\'' +
                ", h_inicio='" + h_inicio + '\'' +
                ", f_final='" + f_final + '\'' +
                ", h_final='" + h_final + '\'' +
                ", promedio='" + promedio + '\'' +
                ", operador='" + operador + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoAl='" + estadoAl + '\'' +
                ", id_placa='" + id_placa + '\'' +
                ", N_placa='" + N_placa + '\'' +
                ", N_corrida='" + N_corrida + '\'' +
                '}';
    }
}
