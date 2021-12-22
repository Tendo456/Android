package com.example.breaks.RetrofitData;

import com.example.breaks.Modelos.MarcasResponse;
import com.example.breaks.Modelos.StockResponse;

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


    @GET("Stock/GetStock.php")
    Call<List<StockResponse>> getStock(@Query("fecha_s") String fecha_s);

    @FormUrlEncoded
    @POST("Stock/ActualizarStock.php")
    Call<StockResponse> UDStock (
            @Field("id_stock") String id_stock,
            @Field("stock") String stock,
            @Field("fecha_s") String fecha_s);
}
