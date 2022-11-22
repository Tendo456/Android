package com.example.laravel.retrofit_Data;

import com.example.laravel.Modelos.MainResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {

    @GET("android")
    Call<List<MainResponse>> getDato();

    @GET("android/get/{id}")
    Call<List<MainResponse>> datoID(@Path("id") String id);


    @POST("android")
    @FormUrlEncoded
    Call<MainResponse> insert (@Field("nombre") String nombre,
                                       @Field("edad") String edad,
                                       @Field("dni") String dni);

    @PUT("android/up/{id}")
    @FormUrlEncoded
    Call<MainResponse> updatePost(@Path("id") String id,
                          @Field("nombre") String nombre,
                          @Field("edad") String edad,
                          @Field("dni") String dni);

    @DELETE("android/dt/{id}")
    Call<MainResponse> dt(@Path("id") String id);

}
