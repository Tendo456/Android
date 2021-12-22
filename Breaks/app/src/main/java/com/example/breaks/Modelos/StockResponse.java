package com.example.breaks.Modelos;

import java.io.Serializable;

public class StockResponse implements Serializable {

    private String id_stock;
    private String id_marcas;
    private String stock;
    private String fecha_s;
    private String marca;
    private String mensaje;

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }

    public String getId_marcas() {
        return id_marcas;
    }

    public void setId_marcas(String id_marcas) {
        this.id_marcas = id_marcas;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getFecha_s() {
        return fecha_s;
    }

    public void setFecha_s(String fecha_s) {
        this.fecha_s = fecha_s;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "StockResponse{" +
                "id_stock='" + id_stock + '\'' +
                ", id_marcas='" + id_marcas + '\'' +
                ", stock='" + stock + '\'' +
                ", fecha_s='" + fecha_s + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
