package com.example.appriesgo.RetrofitData;

import com.example.appriesgo.Modelos.ConsultaResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    @GET("uno/prueba.php")
    Call<List<ConsultaResponse>> getPer(@Query("numero_documento") String numero_documento);
}
