package com.example.laboratoriomolecular.Retrofit_Data;

import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.Modelos.AmplificacionResponse;
import com.example.laboratoriomolecular.Modelos.AreaResponse;
import com.example.laboratoriomolecular.Modelos.ExtraccionResponse;
import com.example.laboratoriomolecular.Modelos.OperadorResponse;
import com.example.laboratoriomolecular.Modelos.PlacaResponse;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.Modelos.ResultadosResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
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
                                   @Field("N_corrida") String N_corrida,
                                   @Field("fechaP") String fechaP,
                                   @Field("id_recepcion") String id_recepcion);

    @GET("Placas/lineaPlacas.php")
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

    @GET("Area_Limpia/ConseguirArea.php")
    Call<List<AreaResponse>> conseguirArea(@Query("f_inicio") String f_inicio);

    @FormUrlEncoded
    @POST("Area_Limpia/InsertarArea.php")
    Call<AreaResponse> InsertarArea (@Field("q_muestras") String q_muestras,
                                     @Field("f_inicio") String f_inicio,
                                     @Field("h_inicio") String h_inicio,
                                     @Field("operador") String operador,
                                     @Field("dni") String dni,
                                     @Field("estadoAr") String estadoAr,
                                     @Field("id_placa") String id_placa);

    @FormUrlEncoded
    @POST("Area_Limpia/FinalizarArea.php")
    Call<AreaResponse> upArea (@Field("id_placa") String id_placa,
                               @Field("f_final") String f_final,
                               @Field("h_final") String h_final,
                               @Field("promedio") String promedio,
                               @Field("estadoAr") String estadoAr);

    @GET("Amplificacion/ConseguirAmplificacion.php")
    Call<List<AmplificacionResponse>> conseguirAmplificacion(@Query("f_inicio") String f_inicio);

    @FormUrlEncoded
    @POST("Amplificacion/InsertarAmplificacion.php")
    Call<AmplificacionResponse> InsertarAmplificacion (@Field("q_muestras") String q_muestras,
                                              @Field("f_inicio") String f_inicio,
                                              @Field("h_inicio") String h_inicio,
                                              @Field("operador") String operador,
                                              @Field("dni") String dni,
                                              @Field("estadoAm") String estadoAm,
                                              @Field("id_placa") String id_placa);

    @FormUrlEncoded
    @POST("Amplificacion/FinalizarAmplificacion.php")
    Call<AmplificacionResponse> upAmplificacion (@Field("id_placa") String id_placa,
                                                 @Field("f_final") String f_final,
                                                 @Field("h_final") String h_final,
                                                 @Field("promedio") String promedio,
                                                 @Field("M_valido") String M_valido,
                                                 @Field("M_invalido") String M_invalido,
                                                 @Field("Ci_valido") String Ci_valido,
                                                 @Field("Ci_invalido") String Ci_invalido,
                                                 @Field("estadoAm") String estadoAm);


    @GET("Placas/CountPlacaRes.php")
    Call<List<AmplificacionResponse>> countPlaca(@Query("f_inicio") String f_inicio);

    @GET("Resultados/FirstPro.php")
    Call<List<AlicuotadoResponse>> firstProc(@Query("f_inicio") String f_inicio);

    @GET("Resultados/ConseguirResultados.php")
    Call<List<ResultadosResponse>> conseguirResultados(@Query("f_inicio") String f_inicio);

    @FormUrlEncoded
    @POST("Resultados/iniciarResultados.php")
    Call<ResultadosResponse> IniciarResultado (@Field("placas") String placas,
                                               @Field("f_inicio") String f_inicio,
                                               @Field("h_inicio") String h_inicio,
                                               @Field("operador") String operador,
                                               @Field("dni") String dni,
                                               @Field("estadoRes") String estadoRes);

    @FormUrlEncoded
    @POST("Resultados/FinalizarResultados.php")
    Call<ResultadosResponse> FinalizarResultado (@Field("id_resultados") String id_resultados,
                                                 @Field("placas") String placas,
                                                 @Field("f_inicio") String f_inicio,
                                                 @Field("f_final") String f_final,
                                                 @Field("h_final") String h_final,
                                                 @Field("promedio") String promedio,
                                                 @Field("estadoRes") String estadoRes);
}
