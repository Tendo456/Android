package com.example.laravel.retrofit_Data;

import com.example.laravel.Modelos.MainResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @GET("android")
    Call<List<MainResponse>> getDato();


    @POST("android")
    @FormUrlEncoded
    Call<MainResponse> insert (@Field("nombre") String nombre,
                                       @Field("edad") String edad,
                                       @Field("dni") String dni);

}
