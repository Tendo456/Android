package com.example.breaks.Modelos;

import java.io.Serializable;

public class StockResponse implements Serializable {

    private String id_stock;
    private String id_marca;
    private String stock;
    private String fecha_s;
    private String mensaje;

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }

    public String getId_marca() {
        return id_marca;
    }

    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
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

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "StockResponse{" +
                "id_stock='" + id_stock + '\'' +
                ", id_marca='" + id_marca + '\'' +
                ", stock='" + stock + '\'' +
                ", fecha_s='" + fecha_s + '\'' +
                '}';
    }
}
