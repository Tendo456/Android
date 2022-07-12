package com.example.reportes.RetrofitData;

import com.example.reportes.Modelos.PersonalResponse;
import com.example.reportes.Modelos.ControlHoraResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @GET("Personal/GetPersonalC.php")
    Call<List<PersonalResponse>> getPerC(@Query("correo") String correo);

    @GET("Reportes/GetTiempos.php")
    Call<List<ControlHoraResponse>> getTime(@Query("fecha") String fecha);

    @GET("Personal/GetPersonalB.php")
    Call<List<PersonalResponse>> getPerB(@Query("DNI") String DNI);

    @FormUrlEncoded
    @POST("Reportes/InsertarCH.php")
    Call<ControlHoraResponse> ADDControlH (
            @Field("id_personal") String id_personal,
            @Field("fecha") String fecha,
            @Field("hora") String hora,
            @Field("encargado") String encargado);

}
