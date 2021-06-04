package com.example.laboratoriomolecular.Modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlacaSpinner{

    @SerializedName("placas")
    @Expose
    private List<Object> placas = null;
    @SerializedName("id_placa")
    @Expose
    private String id_placa;
    @SerializedName("N_placa")
    @Expose
    private String N_placa;
    @SerializedName("fecha")
    @Expose
    private String fecha;

    public List<Object> getPlacas() {
        return placas;
    }

    public void setPlacas(List<Object> placas) {
        this.placas = placas;
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

    public PlacaSpinner(String n_placa) { this.N_placa = n_placa; }
    public String toString (){
        return N_placa;
    }
}
