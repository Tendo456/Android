package com.example.laboratorio.Modelos;

public class PlacaSpinner{

    private String id_placa;
    private String N_placa;
    private String q_muestrasP;
    private String N_corrida;
    private String fechaP;

    public PlacaSpinner(){}

    public PlacaSpinner(String id_placa, String q_muestrasP, String N_placa, String N_corrida, String fechaP){

        this.id_placa = id_placa;
        this.N_placa = N_placa;
        this.q_muestrasP = q_muestrasP;
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

    public String getQ_muestrasP() {
        return q_muestrasP;
    }

    public void setQ_muestrasP(String q_muestrasP) {
        this.q_muestrasP = q_muestrasP;
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
    public String toString() { return N_placa; }
}
