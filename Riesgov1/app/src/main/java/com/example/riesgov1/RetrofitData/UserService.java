package com.example.riesgov1.RetrofitData;

import com.example.riesgov1.Modelos.ConsultaResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {


    @GET("uno/riesgo.php")
    Call<List<ConsultaResponse>> getPer(@Query("dni") String dni);
}

