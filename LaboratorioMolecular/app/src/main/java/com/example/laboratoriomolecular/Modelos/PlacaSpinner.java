package com.example.laboratoriomolecular.Modelos;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PlacaSpinner{

    private String id_placa;
    private String N_placa;
    private String q_muestras;
    private String fechaP;

    public PlacaSpinner(){}

    public PlacaSpinner(String id_placa, String q_muestras, String N_placa, String fechaP){

        this.id_placa = id_placa;
        this.N_placa = N_placa;
        this.q_muestras = q_muestras;
        this.fechaP = fechaP;
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

    public String getQ_muestras() {
        return q_muestras;
    }

    public void setQ_muestras(String q_muestras) {
        this.q_muestras = q_muestras;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    @Override
    public String toString() { return N_placa; }
}
