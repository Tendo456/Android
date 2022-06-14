package com.example.ingreso;



public class Users1 {

    private String id_personal,nombres,dni,edad,sexo,idruta;

    public Users1() {
    }



    public Users1(String id_personal, String nombres, String dni, String edad, String sexo, String idruta){
        this.id_personal = id_personal;
        this.nombres = nombres;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.idruta = idruta;




    }

    public String getId_Personal() {
        return id_personal;
    }

    public void setId_Personal(String id_personal) {
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

    public String getIdruta() {
        return idruta;
    }

    public void setIdruta(String idruta) {
        this.idruta = idruta;
    }




}
