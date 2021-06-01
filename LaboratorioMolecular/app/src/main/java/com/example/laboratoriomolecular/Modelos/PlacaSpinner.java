package com.example.laboratoriomolecular.Modelos;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class PlacaSpinner {

    private String id_placa;
    private String N_placa;
    private String fecha;

    public PlacaSpinner(){ }

    public PlacaSpinner(String id_placa, String N_placa, String fecha){
        this.id_placa = id_placa;
        this.N_placa = N_placa;
        this.fecha = fecha;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @NonNull
    @NotNull
    @Override
    public String toString() { return N_placa; }
}
