package com.example.laravel.retrofit_Data;

import com.example.laravel.Modelos.MainResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {

    @GET("Equipos/getEquipos.php")
    Call<List<MainResponse>> getDato(@Query("id") String id);

}
