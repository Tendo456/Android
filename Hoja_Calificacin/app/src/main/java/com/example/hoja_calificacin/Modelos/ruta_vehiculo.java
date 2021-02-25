package com.example.hoja_calificacin.Modelos;

public class ruta_vehiculo {

    private String idvehiculo, placa;

    public ruta_vehiculo(){}

    public ruta_vehiculo(String idvehiculo, String placa){
        this.idvehiculo = idvehiculo;
        this.placa = placa;
    }

    public String getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(String idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    @Override
    public String toString(){
        return idvehiculo+" - "+placa;
    }


}
