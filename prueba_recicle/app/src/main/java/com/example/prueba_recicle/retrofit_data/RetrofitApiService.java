package com.example.prueba_recicle.retrofit_data;

import com.example.prueba_recicle.model.ItemList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitApiService {

    @GET("index.php")
    Call<List<ItemList>> getItemsDB();

    @POST("add.php")
    @Headers("Accept: application/json")
    fun postLogin(
            @Query("nombre")nombre: String?,
            @Query("poster")poster: String?
    ); Call<ItemList>
}
