package com.example.hojadecalificacion;

public class ruta_conductor {
    private String idconductor, nombre_conductor;


    public ruta_conductor() {}

    public ruta_conductor(String idconductor, String nombre_conductor) {
        this.idconductor = idconductor;
        this.nombre_conductor = nombre_conductor;

    }

    public String getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(String idconductor) {
        this.idconductor = idconductor;
    }

    public String getNombre_conductor() {
        return nombre_conductor;
    }

    public void setNombre_conductor(String nombre_conductor) {
        this.nombre_conductor = nombre_conductor;
    }
    @Override
    public String toString(){
        return idconductor+" - "+nombre_conductor;
    }
}
