package com.example.laboratoriomolecular.Retrofit_Data;

import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.ExtraccionResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    @FormUrlEncoded
    @POST("Recepcion/InsertarRecepcion.php")
    Call<RecepcionResponse> InsertarRecepcion (@Field("fecha") String fecha,
                                               @Field("hora") String hora,
                                               @Field("n_envio") String n_envio,
                                               @Field("q_muestras") String q_muestras,
                                               @Field("operador") String operador,
                                               @Field("dni") String dni,
                                               @Field("estadoRe") String estadoRe);

    @GET("Recepcion/ListarRecepcion.php")
    Call<List<RecepcionResponse>> getRecepcion();

    @GET("Recepcion/ListarRecepcion.php")
    Call<List<OperadorResponse>> getOperador();

    @GET("Recepcion/ListarRecepcionFecha.php")
    Call<List<RecepcionResponse>> getRecepcionF(@Query("fecha") String fecha);

    @FormUrlEncoded
    @POST("Placas/InsertarPlaca.php")
    Call<PlacaResponse> savePlaca (@Field("N_placa") String N_placa,
                                   @Field("fechaP") String fechaP);

    @GET("Placas/ListarPlacaF.php")
    Call<List<PlacaResponse>> getPlacaF(@Query("fechaP") String fechaP);

    @GET("Alicuotado/ConseguirAlicuotado.php")
    Call<List<AlicuotadoResponse>> conseguirAl(@Query("f_inicio") String f_inicio);

    @FormUrlEncoded
    @POST("Alicuotado/InsertarAlicuotado.php")
    Call<AlicuotadoResponse> InsertarAlicuotado (@Field("q_muestras") String q_muestras,
                                               @Field("f_inicio") String f_inicio,
                                               @Field("h_inicio") String h_inicio,
                                               @Field("operador") String operador,
                                               @Field("dni") String dni,
                                               @Field("estadoAl") String estadoAl,
                                                @Field("id_placa") String id_placa);

    @FormUrlEncoded
    @POST("Alicuotado/FinalizarAlicuotado.php")
    Call<AlicuotadoResponse> upAlicuotado (@Field("id_placa") String id_placa,
                                           @Field("f_final") String f_final,
                                           @Field("h_final") String h_final,
                                           @Field("promedio") String promedio,
                                           @Field("estadoAl") String estadoAl);

    @GET("Extraccion/ConseguirExtraccion.php")
    Call<List<ExtraccionResponse>> conseguirExtraccion(@Query("f_inicio") String f_inicio);

    @FormUrlEncoded
    @POST("Extraccion/InsertarExtraccion.php")
    Call<ExtraccionResponse> InsertarExtraccion (@Field("f_inicio") String f_inicio,
                                                 @Field("h_inicio") String h_inicio,
                                                 @Field("operador") String operador,
                                                 @Field("dni") String dni,
                                                 @Field("estadoEx") String estadoEx,
                                                 @Field("id_placa") String id_placa);

    @FormUrlEncoded
    @POST("Extraccion/FinalizarExtraccion.php")
    Call<ExtraccionResponse> upExtraccion (@Field("id_placa") String id_placa,
                                           @Field("f_final") String f_final,
                                           @Field("h_final") String h_final,
                                           @Field("promedio") String promedio,
                                           @Field("estadoEx") String estadoEx);


}
