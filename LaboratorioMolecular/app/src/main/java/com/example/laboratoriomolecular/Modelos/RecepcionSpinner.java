package com.example.laboratoriomolecular.Modelos;

public class RecepcionSpinner {

    private String id_recepcion;
    private String n_envio;

    public RecepcionSpinner(){}

    public RecepcionSpinner(String id_recepcion, String n_envio){

        this.id_recepcion = id_recepcion;
        this.n_envio = id_recepcion;

    }

    public String getId_recepcion() {
        return id_recepcion;
    }

    public void setId_recepcion(String id_recepcion) {
        this.id_recepcion = id_recepcion;
    }

    public String getN_envio() {
        return n_envio;
    }

    public void setN_envio(String n_envio) {
        this.n_envio = n_envio;
    }

    @Override
    public String toString() { return n_envio; }
}
