package com.example.inventarioqr.RetrofitData;

import com.example.inventarioqr.Modelos.LectorResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @GET("Equipos/getEquipos.php")
    Call<List<LectorResponse>> getEquipo(@Query("id") String id);

    @FormUrlEncoded
    @POST("Equipos/insertEquipos.php")
    Call<LectorResponse> insertEquipo (@Field("equipo") String equipo,
                                        @Field("serie") String serie,
                                        @Field("descripcion") String descripcion);

    @GET("Equipos/lastEquipo.php")
    Call<List<LectorResponse>> lastPC();

}
