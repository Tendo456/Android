package com.example.screeningapp.Modelos;

public class ProgramacionResponseSP {


    private String id_stock;
    private String marca;
    private String fecha;
    private String tipo;
    private String estado;
    private String stock_cant;


    public ProgramacionResponseSP(){ }

    public ProgramacionResponseSP(String id_stock, String marca, String fecha, String tipo, String estado, String stock_cant){

        this.id_stock = id_stock;
        this.marca = marca;
        this.marca = fecha;
        this.marca = tipo;
        this.marca = estado;
        this.marca = stock_cant;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStock_cant() {
        return stock_cant;
    }

    public void setStock_cant(String stock_cant) {
        this.stock_cant = stock_cant;
    }

    @Override
    public String toString() {
        return marca;
    }
}
