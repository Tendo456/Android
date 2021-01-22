package com.example.adapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    @GET("posts")
    Call<List<UserResponse>> getPost();

    @POST("posts")
    Call<UserRequest> postDataToServer(@Body UserRequest userRequest);


    @GET("posts")
    Call<List<UserResponse>> getPostById(@Query("userId") Integer userId);

    @PATCH("posts/{id}")
    Call<List<UserResponse>> getPatch(@Path("id") int id, @Body UserResponse userResponse);


    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);
}
