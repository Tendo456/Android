package com.example.temperaturas.Conexion;

import com.example.temperaturas.Modelos.AtencionesRequest;
import com.example.temperaturas.Modelos.AtencionesResponse;

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

    @GET("albums")
    Call<List<AtencionesResponse>> getPost();

    @POST("posts")
    Call<AtencionesRequest> postDataToServer(@Body AtencionesRequest userRequest);


    @GET("app")
    Call<List<AtencionesResponse>> getPostById(@Query("iduser") Integer iduser);

    @PATCH("posts/{id}")
    Call<List<AtencionesResponse>> getPatch(@Path("id") int id, @Body AtencionesResponse userResponse);


    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);

}
