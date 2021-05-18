package com.example.labprueba2;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {

    @FormUrlEncoded
    @POST("insertarRecepcion.php")
    Call<RespPost> insert (@Field("hora") String hora,
                            @Field("n_envio") String n_envio,
                            @Field("q_muestras") String q_muestras,
                            @Field("operador") String operador,
                            @Field("dni") String dni,
                            @Field("estado") String estado);

}
