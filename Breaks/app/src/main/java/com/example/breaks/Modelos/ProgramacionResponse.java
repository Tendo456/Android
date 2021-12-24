package com.example.breaks.Modelos;

import java.io.Serializable;

public class ProgramacionResponse implements Serializable {

    private String id_programacion;
    private String id_stock;
    private String fecha_prog;
    private String cantidad_marc;
    private String marca;
    private String mensaje;

    public String getId_programacion() {
        return id_programacion;
    }

    public void setId_programacion(String id_programacion) {
        this.id_programacion = id_programacion;
    }

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }

    public String getFecha_prog() {
        return fecha_prog;
    }

    public void setFecha_prog(String fecha_prog) {
        this.fecha_prog = fecha_prog;
    }

    public String getCantidad_marc() {
        return cantidad_marc;
    }

    public void setCantidad_marc(String cantidad_marc) {
        this.cantidad_marc = cantidad_marc;
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
        return "ProgramacionResponse{" +
                "id_programacion='" + id_programacion + '\'' +
                ", id_stock='" + id_stock + '\'' +
                ", fecha_prog='" + fecha_prog + '\'' +
                ", cantidad_marc='" + cantidad_marc + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
