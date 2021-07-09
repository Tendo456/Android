package com.example.laboratoriomolecular.Modelos;

public class PlacaSpinnerRes {

    private String id_placa;
    private String N_placa;
    private String q_muestras;
    private String N_corrida;
    private String fechaP;

    public PlacaSpinnerRes(){}

    public PlacaSpinnerRes(String id_placa, String q_muestras, String N_placa, String N_corrida, String fechaP){


        this.id_placa = id_placa;
        this.N_placa = N_placa;
        this.q_muestras = q_muestras;
        this.N_corrida = N_corrida;
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

    public String getN_corrida() {
        return N_corrida;
    }

    public void setN_corrida(String n_corrida) {
        N_corrida = n_corrida;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    @Override
    public String toString() { return N_corrida; }

}
