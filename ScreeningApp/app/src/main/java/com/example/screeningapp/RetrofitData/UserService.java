package com.example.screeningapp.RetrofitData;

import com.example.screeningapp.Modelos.AsigResponse;
import com.example.screeningapp.Modelos.BreaksResponse;
import com.example.screeningapp.Modelos.LlaveResponse;
import com.example.screeningapp.Modelos.MarcasResponse;
import com.example.screeningapp.Modelos.PersonalResponse;
import com.example.screeningapp.Modelos.ProgramacionResponse;
import com.example.screeningapp.Modelos.StockResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @FormUrlEncoded
    @POST("Marcas/InsertarMarca.php")
    Call<MarcasResponse> InsertarMarca (@Field("marca") String marca,
                                            @Field("fecha") String fecha,
                                            @Field("tipo") String tipo,
                                            @Field("estado") String estado);

    @GET("Marcas/GetMarcas.php")
    Call<List<MarcasResponse>> getMarcas(@Query("estado") String estado);

    @FormUrlEncoded
    @POST("Marcas/ActualizarMarca.php")
    Call<MarcasResponse> UDMarca (
            @Field("id_marcas") String id_marcas,
            @Field("marca") String marca,
                                        @Field("fecha") String fecha,
                                        @Field("tipo") String tipo,
                                        @Field("estado") String estado);


    @FormUrlEncoded
    @POST("Stock/InsertarStock.php")
    Call<StockResponse> ADDStock (
            @Field("id_marcas") String id_marcas,
            @Field("stock_cant") String stock_cant,
            @Field("stock_ini") String stock_ini,
            @Field("fecha_s") String fecha_s,
    @Field("estadoSK") String estadoSK);

    @GET("Stock/GetStock.php")
    Call<List<StockResponse>> getStock(@Query("estadoSK") String fecha_s);

    @FormUrlEncoded
    @POST("Stock/ActualizarStock.php")
    Call<StockResponse> UDStock (
            @Field("id_stock") String id_stock,
            @Field("stock_ini") String stock_ini,
            @Field("stock_cant") String stock_cant,
            @Field("fecha_s") String fecha_s,
            @Field("estadoSK") String estadoSK);


    @FormUrlEncoded
    @POST("Programacion/InsertarProgramacion.php")
    Call<ProgramacionResponse> ADDProg (
            @Field("id_stock") String id_stock,
            @Field("cantidad_marc") String cantidad_marc,
            @Field("fecha_prog") String fecha_prog,
            @Field("stock_cant") String stock_cant);

    @GET("Programacion/GetProgramacion.php")
    Call<List<ProgramacionResponse>> getProg(@Query("fecha_prog") String fecha_prog);

    @FormUrlEncoded
    @POST("Programacion/ActualizarProgramacion.php")
    Call<ProgramacionResponse> UDProg (
            @Field("id_programacion") String id_programacion,
            @Field("cantidad_marc") String cantidad_marc,
            @Field("fecha_prog") String fecha_prog,
            @Field("id_stock") String id_stock,
            @Field("stock_cant") String stock_cant);


    @FormUrlEncoded
    @POST("Personal/InsertarPersonal.php")
    Call<PersonalResponse> ADDPers (
            //@Field("id_personal") String id_personal,
            @Field("nombres") String nombres,
            @Field("apelli_paterno") String apelli_paterno,
            @Field("apelli_materno") String apelli_materno,
            @Field("DNI") String DNI,
            @Field("correo") String correo,
            @Field("rol") String rol,
            @Field("estado") String estado);

    @GET("Personal/GetPersonal.php")
    Call<List<PersonalResponse>> getPersonal(@Query("estado") String estado);

    @GET("Personal/GetPersonalB.php")
    Call<List<PersonalResponse>> getPerB(@Query("DNI") String DNI);

    @GET("Personal/GetPersonalC.php")
    Call<List<PersonalResponse>> getPerC(@Query("correo") String correo);

    @FormUrlEncoded
    @POST("Personal/ActualizarPersonal.php")
    Call<PersonalResponse> UDPers (
            @Field("id_personal") String id_personal,
            @Field("nombres") String nombres,
            @Field("apelli_paterno") String apelli_paterno,
            @Field("apelli_materno") String apelli_materno,
            @Field("DNI") String DNI,
            @Field("correo") String correo,
            @Field("rol") String rol,
            @Field("estado") String estado);

    @GET("Breaks/GetBreaks.php")
    Call<List<BreaksResponse>> getBreak(@Query("fecha_break") String fecha_break);

    @FormUrlEncoded
    @POST("Breaks/InsertarBreaks.php")
    Call<BreaksResponse> ADDBreaks (
            @Field("id_personal") String id_personal,
            @Field("fecha_break") String fecha_break,
            @Field("hora_break") String hora_break,
            @Field("encargado") String encargado);

    @GET("Programacion/Bebidas.php")
    Call<List<ProgramacionResponse>> getBebida(@Query("fecha_break") String fecha_break);

    @GET("Programacion/Galletas.php")
    Call<List<ProgramacionResponse>> getGalleta(@Query("fecha_break") String fecha_break);

    @GET("Llaves/GetLlaves.php")
    Call<List<LlaveResponse>> getLlaves(@Query("estado") String estado);

    @FormUrlEncoded
    @POST("Llaves/InsertarLlaves.php")
    Call<LlaveResponse> ADDllave (
            @Field("numero") String numero);

    @FormUrlEncoded
    @POST("Llaves/InsertarBreaks.php")
    Call<AsigResponse> ADDAsig (
            @Field("id_personal") String id_personal,
            @Field("id_llave") String id_llave,
            @Field("comentario") String comentario,
            @Field("tipo") String tipo,
    @Field("estado") String estado);

}
