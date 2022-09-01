package com.example.appriesgo.Modelos;

public class ConsultaResponse {

    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String numero_documento;
    private String condicion;
    //private String id_comorbilidad;
    //private String seguimiento;
    //private String retorna_trabajo;


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "ConsultaResponse{" +
                "nombres='" + nombres + '\'' +
                ", apellido_paterno='" + apellido_paterno + '\'' +
                ", apellido_materno='" + apellido_materno + '\'' +
                ", numero_documento='" + numero_documento + '\'' +
                ", condicion='" + condicion + '\'' +
                '}';
    }
}
