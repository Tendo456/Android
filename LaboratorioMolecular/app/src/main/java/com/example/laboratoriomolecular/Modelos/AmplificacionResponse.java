package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class AmplificacionResponse implements Serializable {

    private String id_amplificacion;
    private String q_muestras;
    private String f_inicio;
    private String h_inicio;
    private String f_final;
    private String h_final;
    private String promedio;
    private String M_valido;
    private String M_invalido;
    private String Ci_valido;
    private String Ci_invalido;
    private String operador;
    private String dni;
    private String observacion;
    private String estadoAm;
    private String id_placa;
    private String N_placa;
    private String N_corrida;
    private String total;
    private String mensaje;

    public String getId_amplificacion() {
        return id_amplificacion;
    }

    public void setId_amplificacion(String id_amplificacion) {
        this.id_amplificacion = id_amplificacion;
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

    public String getM_valido() {
        return M_valido;
    }

    public void setM_valido(String m_valido) {
        M_valido = m_valido;
    }

    public String getM_invalido() {
        return M_invalido;
    }

    public void setM_invalido(String m_invalido) {
        M_invalido = m_invalido;
    }

    public String getCi_valido() {
        return Ci_valido;
    }

    public void setCi_valido(String ci_valido) {
        Ci_valido = ci_valido;
    }

    public String getCi_invalido() {
        return Ci_invalido;
    }

    public void setCi_invalido(String ci_invalido) {
        Ci_invalido = ci_invalido;
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

    public String getEstadoAm() {
        return estadoAm;
    }

    public void setEstadoAm(String estadoAm) {
        this.estadoAm = estadoAm;
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "AmplificacionResponse{" +
                "id_amplificacion='" + id_amplificacion + '\'' +
                ", q_muestras='" + q_muestras + '\'' +
                ", f_inicio='" + f_inicio + '\'' +
                ", h_inicio='" + h_inicio + '\'' +
                ", f_final='" + f_final + '\'' +
                ", h_final='" + h_final + '\'' +
                ", promedio='" + promedio + '\'' +
                ", M_valido='" + M_valido + '\'' +
                ", M_invalido='" + M_invalido + '\'' +
                ", Ci_valido='" + Ci_valido + '\'' +
                ", Ci_invalido='" + Ci_invalido + '\'' +
                ", operador='" + operador + '\'' +
                ", dni='" + dni + '\'' +
                ", observacion='" + observacion + '\'' +
                ", estadoAm='" + estadoAm + '\'' +
                ", id_placa='" + id_placa + '\'' +
                ", N_placa='" + N_placa + '\'' +
                ", N_corrida='" + N_corrida + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
