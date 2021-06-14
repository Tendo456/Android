package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class PlacaResponse implements Serializable {

    private String id_placa;
    private String N_placa;
    private String fechaP;
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

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "PlacaResponse{" +
                "id_placa='" + id_placa + '\'' +
                ", N_placa='" + N_placa + '\'' +
                ", fechaP='" + fechaP + '\'' +
                '}';
    }
}
