package com.example.inventarioqr.RetrofitData;

import com.example.inventarioqr.Modelos.LectorResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {

    @GET("getEquipos/getEquipos.php")
    Call<List<LectorResponse>> getEquipo(@Query("id") String id);

}
