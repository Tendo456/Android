package com.example.temp;

public class Personal {

    private String id_personal,nombres,dni,edad,sexo,temperatura1,temperatura2;

    public Personal() {
    }


    public Personal(String id_personal, String nombres, String dni, String edad, String sexo,String temperatura1, String temperatura2) {
        this.id_personal = id_personal;
        this.nombres = nombres;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.temperatura1 = temperatura1;
        this.temperatura2 = temperatura2;
    }

    public String getId_personal() {
        return id_personal;
    }

    public void setId(String id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombres() { return nombres; }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTemperatura1() {
        return temperatura1;
    }

    public void setTemperatura1(String temperatura1) {
        this.temperatura1 = temperatura1;
    }

    public String getTemperatura2() {
        return temperatura2;
    }

    public void setTemperatura2(String temperatura2) { this.temperatura2 = temperatura2;
    }


}
