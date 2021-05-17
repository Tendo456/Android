package com.example.labprueba;

public class UserRequest {

    private String hora;
    private String n_envio;
    private String q_muestras;
    private String operador;
    private String dni;
    private String estado;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
