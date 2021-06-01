package com.example.laboratoriomolecular.Modelos;

import java.io.Serializable;

public class PlacaResponse implements Serializable {

    private String N_placa;
    private String id_alicuotado;
    private String id_extraccion;
    private String id_area_limpia;
    private String id_amplificacion;
    private String id_resultados;

    public String getN_placa() {
        return N_placa;
    }

    public void setN_placa(String n_placa) {
        N_placa = n_placa;
    }

    public String getId_alicuotado() {
        return id_alicuotado;
    }

    public void setId_alicuotado(String id_alicuotado) {
        this.id_alicuotado = id_alicuotado;
    }

    public String getId_extraccion() {
        return id_extraccion;
    }

    public void setId_extraccion(String id_extraccion) {
        this.id_extraccion = id_extraccion;
    }

    public String getId_area_limpia() {
        return id_area_limpia;
    }

    public void setId_area_limpia(String id_area_limpia) {
        this.id_area_limpia = id_area_limpia;
    }

    public String getId_amplificacion() {
        return id_amplificacion;
    }

    public void setId_amplificacion(String id_amplificacion) {
        this.id_amplificacion = id_amplificacion;
    }

    public String getId_resultados() {
        return id_resultados;
    }

    public void setId_resultados(String id_resultados) {
        this.id_resultados = id_resultados;
    }

    @Override
    public String toString() {
        return "PlacaResponse{" +
                "N_placa='" + N_placa + '\'' +
                ", id_alicuotado='" + id_alicuotado + '\'' +
                ", id_extraccion='" + id_extraccion + '\'' +
                ", id_area_limpia='" + id_area_limpia + '\'' +
                ", id_amplificacion='" + id_amplificacion + '\'' +
                ", id_resultados='" + id_resultados + '\'' +
                '}';
    }
}
