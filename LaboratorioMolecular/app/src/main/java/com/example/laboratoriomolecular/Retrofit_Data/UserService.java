package com.example.laboratoriomolecular.Retrofit_Data;

import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @FormUrlEncoded
    @POST("Recepcion/insertarRecepcion.php")
    Call<RecepcionResponse> InsertarRecepcion (@Field("fecha") String fecha,
                                               @Field("hora") String hora,
                                               @Field("n_envio") String n_envio,
                                               @Field("q_muestras") String q_muestras,
                                               @Field("operador") String operador,
                                               @Field("dni") String dni,
                                               @Field("estado") String estado);

    @GET("Recepcion/ListarRecepcion.php")
    Call<List<RecepcionResponse>> getRecepcion();

    @GET("Recepcion/ListarRecepcion.php")
    Call<List<OperadorResponse>> getOperador();

    @GET("Recepcion/ListarRecepcionFecha.php")
    Call<List<RecepcionResponse>> getRecepcionF(@Query("fecha") String fecha);

    @FormUrlEncoded
    @POST("Placas/InsertarPlaca.php")
    Call<PlacaResponse> savePlaca (@Field("N_placa") String N_placa,
                                   @Field("fecha") String fecha);

    @GET("Placas/ListarPlacaF.php")
    Call<List<PlacaResponse>> getPlacaF(@Query("fecha") String fecha);
}
