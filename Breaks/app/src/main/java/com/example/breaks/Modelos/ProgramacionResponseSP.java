package com.example.breaks.Modelos;

public class ProgramacionResponseSP {


    private String id_stock;
    private String marca;


    public ProgramacionResponseSP(){ }

    public ProgramacionResponseSP(String id_stock, String marca){

        this.id_stock = id_stock;
        this.marca = marca;
    }

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca;
    }
}
