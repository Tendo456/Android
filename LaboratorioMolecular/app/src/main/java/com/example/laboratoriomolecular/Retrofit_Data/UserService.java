package com.example.laboratoriomolecular.Retrofit_Data;

import com.example.laboratoriomolecular.Modelos.RecepcionRequest;
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("insertarRecepcion.php")
    Call<RecepcionResponse> saveRecepcion(@Body RecepcionRequest recepcionRequest);
}
