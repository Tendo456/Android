package com.example.laboratoriomolecular.Retrofit_Data;

import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionRequest;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {

    @POST("insertarRecepcion.php")
    Call<RecepcionResponse> saveRecepcion(@Body RecepcionRequest recepcionRequest);

    @FormUrlEncoded
    @POST("Recepcion/insertarRecepcion.php")
    Call<RecepcionResponse> InsertarRecepcion (@Field("hora") String hora,
                                             @Field("n_envio") String n_envio,
                                             @Field("q_muestras") String q_muestras,
                                             @Field("operador") String operador,
                                             @Field("dni") String dni,
                                             @Field("estado") String estado);

    @GET("Recepcion/ListarRecepcion.php")
    Call<List<RecepcionResponse>> getRecepcion();

    @GET("Recepcion/ListarRecepcion.php")
    Call<List<OperadorResponse>> getOperador();
}
