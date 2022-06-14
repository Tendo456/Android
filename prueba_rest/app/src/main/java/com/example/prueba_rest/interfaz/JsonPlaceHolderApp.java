package com.example.prueba_rest.interfaz;

import com.example.prueba_rest.modelo.post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApp {

    @GET("posts")
    Call<List<post>> getpost();

}
