package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class ResultadosResponse implements Serializable {

    private String id_resultados;
    private String N_corrida;
    private String f_inicio;
    private String h_inicio;
    private String f_final;
    private String h_final;
    private String promedio;
    private String operador;
    private String dni;
    private String observacion;
    private String estadoRes;
    private String mensaje;

    public String getId_resultados() {
        return id_resultados;
    }

    public void setId_resultados(String id_resultados) {
        this.id_resultados = id_resultados;
    }

    public String getN_corrida() {
        return N_corrida;
    }

    public void setN_corrida(String n_corrida) {
        N_corrida = n_corrida;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstadoRes() {
        return estadoRes;
    }

    public void setEstadoRes(String estadoRes) {
        this.estadoRes = estadoRes;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "ResultadosResponse{" +
                "id_resultados='" + id_resultados + '\'' +
                ", N_corrida='" + N_corrida + '\'' +
                ", f_inicio='" + f_inicio + '\'' +
                ", h_inicio='" + h_inicio + '\'' +
                ", f_final='" + f_final + '\'' +
                ", h_final='" + h_final + '\'' +
                ", promedio='" + promedio + '\'' +
                ", operador='" + operador + '\'' +
                ", dni='" + dni + '\'' +
                ", observacion='" + observacion + '\'' +
                ", estadoRes='" + estadoRes + '\'' +
                '}';
    }
}
