package com.example.prueba_rest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.prueba_rest.interfaz.JsonPlaceHolderApp;
import com.example.prueba_rest.modelo.post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView jsontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jsontext = findViewById(R.id.jsontext);

        getPosts();
    }

    private void getPosts(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApp jsonPlaceHolderApp = retrofit.create(JsonPlaceHolderApp.class);

        Call<List<post>> call = jsonPlaceHolderApp.getpost();
        call.enqueue(new Callback<List<post>>() {
            @Override
            public void onResponse(Call<List<post>> call, Response<List<post>> response) {
                if(!response.isSuccessful()){
                    jsontext.setText("Codigo: "+response.code());
                    return;
                }

                List<post> postList = response.body();

                for(post post: postList){
                    String content = "";
                    content += "userId: "+ post.getUserId() + "\n";
                    content += "id: "+ post.getId() + "\n";
                    content += "title: "+ post.getTitle() + "\n";
                    content += "body: "+ post.getBody() + "\n\n";
                    jsontext.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<post>> call, Throwable t) {
                jsontext.setText(t.getMessage());
            }
        });

    }
}