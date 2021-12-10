package com.example.breaks.RetrofitData;

import com.example.breaks.Modelos.MarcasResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {

    @FormUrlEncoded
    @POST("Marcas/InsertarMarca.php")
    Call<MarcasResponse> InsertarMarca (@Field("marca") String marca,
                                            @Field("stock") String stock,
                                            @Field("fecha") String fecha,
                                            @Field("tipo") String tipo,
                                            @Field("estado") String estado);
}
