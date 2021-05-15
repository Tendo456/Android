package com.xcheko51x.ejemplo_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIRest {

    @GET("insertarUser.php")
    Call<List<Usuario>> obtenerUsuarios();

    @GET("insertarUser.php")
    Call<Usuario> obtenerUsuario(
            @Query("idUsuario") String idUsuario
    );

    @POST("insertarUser.php")
    Call<Void> agregarUsuario(
            @Body Usuario usuario
    );

    @PUT("insertarUser.php")
    Call<Void> editarUsuario(
      @Body Usuario usuario
    );

    @DELETE("insertarUser.php")
    Call<Void> eliminarUsuario(
            @Query("idUsuario") String idUsuario
    );
}
