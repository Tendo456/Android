package com.example.inventarioqr.RetrofitData;

import com.example.inventarioqr.Modelos.LectorResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    @GET("inventarioQR/get/{id}")
    Call<List<LectorResponse>> getEquipo(@Path("id") String id);

    @FormUrlEncoded
    @POST("inventarioQR")
    Call<LectorResponse> insertEquipo (@Field("equipo") String equipo,
                                       @Field("serie") String serie,
                                       @Field("usuario") String usuario,
                                       @Field("sede") String sede,
                                       @Field("descripcion") String descripcion);

    @FormUrlEncoded
    @PUT("inventarioQR/up/{id}")
    Call<LectorResponse> updateEquipo (@Path("id") String id,
                                       @Field("equipo") String equipo,
                                       @Field("serie") String serie,
                                       @Field("usuario") String usuario,
                                       @Field("sede") String sede,
                                       @Field("descripcion") String descripcion);

    @GET("inventarioQR/getSerie/{serie}")
    Call<List<LectorResponse>> lastReg(@Path("serie") String serie);

    /* @GET("Equipos/getEquipos.php")
    Call<List<LectorResponse>> getEquipo(@Query("id") String id);

    @GET("Equipos/lastEquipo.php")
    Call<List<LectorResponse>> lastPC();

    @FormUrlEncoded
    @POST("Equipos/updateEquipos.php")
    Call<LectorResponse> updateEquipo (@Field("id") String id,
                                       @Field("equipo") String equipo,
                                       @Field("serie") String serie,
                                       @Field("usuario") String usuario,
                                       @Field("sede") String sede,
                                       @Field("descripcion") String descripcion);

    @GET("Equipos/lastReg.php")
    Call<List<LectorResponse>> lastReg(@Query("serie") String serie); */

}
