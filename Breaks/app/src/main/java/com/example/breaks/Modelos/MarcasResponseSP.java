package com.example.breaks.Modelos;

public class MarcasResponseSP {

    private String id_marcas;
    private String marca;


    public MarcasResponseSP(){ }

    public MarcasResponseSP(String id_marcas, String marca){

        this.id_marcas = id_marcas;
        this.marca = marca;
    }

    public String getId_marcas() {
        return id_marcas;
    }

    public void setId_marcas(String id_marcas) {
        this.id_marcas = id_marcas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() { return marca; }
}
