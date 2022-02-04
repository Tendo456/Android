package com.example.breaks.Modelos;

import java.io.Serializable;

public class StockResponse implements Serializable {

    private String id_stock;
    private String id_marcas;
    private String stock_ini;
    private String stock_cant;
    private String fecha_s;
    private String estadoSK;
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

    public String getStock_ini() {
        return stock_ini;
    }

    public void setStock_ini(String stock_ini) {
        this.stock_ini = stock_ini;
    }

    public String getStock_cant() {
        return stock_cant;
    }

    public void setStock_cant(String stock_cant) {
        this.stock_cant = stock_cant;
    }

    public String getFecha_s() {
        return fecha_s;
    }

    public void setFecha_s(String fecha_s) {
        this.fecha_s = fecha_s;
    }

    public String getEstadoSK() {
        return estadoSK;
    }

    public void setEstadoSK(String estadoSK) {
        this.estadoSK = estadoSK;
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
                ", stock_ini='" + stock_ini + '\'' +
                ", stock_cant='" + stock_cant + '\'' +
                ", fecha_s='" + fecha_s + '\'' +
                ", estadoSk='" + estadoSK + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
