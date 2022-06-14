package com.example.laboratoriomolecular.Modelos;

public class OperadorResponse {

    private String id_operador;
    private String operador;
    private String dni;

    public OperadorResponse(){}

    public OperadorResponse(String id_operador, String operador, String dni){
        this.id_operador = id_operador;
        this.operador = operador;
        this.dni = dni;
    }

    public String getId_operador() {
        return id_operador;
    }

    public void setId_operador(String id_operador) {
        this.id_operador = id_operador;
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

    @Override
    public String toString() {
        return operador;
    }
}
