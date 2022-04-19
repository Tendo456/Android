package com.example.breaks.Modelos;

public class llaveResponse {

    private String id_llavesAsig;
    private String id_personal;
    private String id_llave;
    private String comentario;
    private String tipo;
    private String estado;
    private String mensaje;

    public String getId_llavesAsig() {
        return id_llavesAsig;
    }

    public void setId_llavesAsig(String id_llavesAsig) {
        this.id_llavesAsig = id_llavesAsig;
    }

    public String getId_personal() {
        return id_personal;
    }

    public void setId_personal(String id_personal) {
        this.id_personal = id_personal;
    }

    public String getId_llave() {
        return id_llave;
    }

    public void setId_llave(String id_llave) {
        this.id_llave = id_llave;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "llaveResponse{" +
                "id_llavesAsig='" + id_llavesAsig + '\'' +
                ", id_personal='" + id_personal + '\'' +
                ", id_llave='" + id_llave + '\'' +
                ", comentario='" + comentario + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
