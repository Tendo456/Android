package com.example.getpost;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    @GET("users/")
    Call<List<UserResponse>> getAllUsers();

   @POST("users/")
   Call<UserResponse> saveUser(@Body UserRequest userRequest);

    /*@GET("users/{id}/")
    Call<List<UserResponse>> getAllUsers1(@Path("id") Integer id);*/

    @GET("users/{id}/")
    Call<List<UserResponse>> getAllUsers1(@Query("id") Integer id);
}
