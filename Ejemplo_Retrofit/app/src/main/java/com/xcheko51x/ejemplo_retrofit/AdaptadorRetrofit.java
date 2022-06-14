package com.xcheko51x.ejemplo_retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AdaptadorRetrofit {

    Retrofit retrofit;

    public AdaptadorRetrofit(){ }

    public Retrofit getAdapter(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://tendoprueba.000webhostapp.com/crud/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
