package com.example.hoja_calificacin.Modelos;

public class ruta_personal {
    private String idruta,ruta;

    public ruta_personal(){}

    public ruta_personal(String idruta, String ruta){
        this.idruta = idruta;
        this.ruta = ruta;
    }

    public String getIdruta() {
        return idruta;
    }

    public void setIdruta(String idruta) {
        this.idruta = idruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString(){
        return idruta+" - "+ruta;
    }
}
