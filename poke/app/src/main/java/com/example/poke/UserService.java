package com.example.poke;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface UserService {

    @GET("pokemon/{id}")
    Call<List<PokemonByIdResponse>> getPokemonById(@Path("id") String id);
}

