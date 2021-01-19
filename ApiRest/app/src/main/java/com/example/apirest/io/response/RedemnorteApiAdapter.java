package com.example.apirest.io.response;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RedemnorteApiAdapter {

    private static RedemnorteApiService API_SERVICE;

    public static  RedemnorteApiService getApiService(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        // add logging interceptor
        httpClient.addInterceptor(logging);

        String baseUrl = "https://redemnorte.com/api/";

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- using the log level
                    .build();
            API_SERVICE = retrofit.create(RedemnorteApiService.class);
        }

        return API_SERVICE;

    }


}
