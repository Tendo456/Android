package com.example.screeningapp.Modelos;

public class LlaveResponse {

    private String id_llave;
    private String numero;
    private String estado;
    private String mensaje;

    public String getId_llave() {
        return id_llave;
    }

    public void setId_llave(String id_llave) {
        this.id_llave = id_llave;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "llaveResponse{" +
                "id_llave='" + id_llave + '\'' +
                ", numero='" + numero + '\'' +
                ", estado='" + estado + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
