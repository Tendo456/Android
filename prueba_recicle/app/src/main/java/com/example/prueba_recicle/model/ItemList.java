package com.example.prueba_recicle.model;

import java.io.Serializable;

public class ItemList implements Serializable{

        private String id;
        private String nombre;
        private  String poster;


    public ItemList(String id, String nombre, String poster){

        this.id = id;
        this.nombre = nombre;
        this.poster = poster;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoster() {
        return poster;
    }

    public void setImagen(String imagen) {
        this.poster = imagen;
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", poster='" + poster + '\'' +
                '}';
    }
}


