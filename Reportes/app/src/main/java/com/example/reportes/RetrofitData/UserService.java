package com.example.reportes.RetrofitData;

import com.example.reportes.Modelos.PersonalResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {

    @GET("Personal/GetPersonalC.php")
    Call<List<PersonalResponse>> getPerC(@Query("correo") String correo);

}
