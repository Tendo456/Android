package com.example.riesgov1.Modelos;

public class ConsultaResponse {

    private String nombres;
    private String dni;
    private String retorna;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRetorna() {
        return retorna;
    }

    public void setRetorna(String retorna) {
        this.retorna = retorna;
    }

    @Override
    public String toString() {
        return "ConsultaResponse{" +
                "nombres='" + nombres + '\'' +
                ", dni='" + dni + '\'' +
                ", retorna='" + retorna + '\'' +
                '}';
    }
}
