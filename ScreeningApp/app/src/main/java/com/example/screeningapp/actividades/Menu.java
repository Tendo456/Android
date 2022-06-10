package com.example.screeningapp.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.screeningapp.Modelos.PersonalResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.RetrofitData.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Menu extends AppCompatActivity {

    String emailuserME;
    String corr, rol;
    ImageView menu1, menu2, menu3, menu4, menu5, menu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        emailuserME = getIntent().getStringExtra("EmailUser");
        menu1 = findViewById(R.id.menu1);
        menu2 = findViewById(R.id.menu2);
        menu3 = findViewById(R.id.menu3);
        menu4= findViewById(R.id.menu4);
        menu5 = findViewById(R.id.menu5);
        menu6 = findViewById(R.id.menu6);

        menu1.setOnClickListener(view -> menu1LL());
        menu2.setOnClickListener(view -> menu2LL());
        menu3.setOnClickListener(view -> menu3LL());
        menu4.setOnClickListener(view -> menu4LL());
        menu5.setOnClickListener(view -> menu5LL());
        //menu6.setOnClickListener(view -> menu6LL());

        usuario();
    }

    public void usuario(){
        Call<List<PersonalResponse>> userC = ApiClient.getUserService().getPerC(emailuserME);
        userC.enqueue(new Callback<List<PersonalResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<PersonalResponse>> call, @NonNull Response<List<PersonalResponse>> response) {
                if(response.isSuccessful()){
                    String rol1 = null;

                    List<PersonalResponse> personalResponses = response.body();
                    assert personalResponses != null;
                    for (PersonalResponse personalResponse: personalResponses){
                        rol = personalResponse.getRol();
                        rol1=rol;
                    }
                    if(rol1 == null){
                        Toast.makeText(Menu.this, "No Encontrado", Toast.LENGTH_SHORT).show();
                        //.setEnabled(false);
                        menu1.setEnabled(false);
                        menu2.setEnabled(false);
                        menu3.setEnabled(false);
                        menu4.setEnabled(false);
                        menu5.setEnabled(false);

                    }else if(rol1.equals("1")) {
                        menu1.setEnabled(true);
                        menu2.setEnabled(true);
                        menu3.setEnabled(true);
                        menu4.setEnabled(true);
                        menu5.setEnabled(true);
                    }else if(rol1.equals("2")){
                        menu1.setEnabled(false);
                        menu2.setEnabled(false);
                        menu3.setEnabled(true);
                        menu4.setEnabled(false);
                        menu5.setEnabled(true);
                    }

                }else {
                    Toast.makeText(Menu.this, "Error"+ response.code(), Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(@NonNull Call<List<PersonalResponse>> call, @NonNull Throwable t) {
                Toast.makeText(Menu.this, "Error Code: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void menu1LL (){
        Intent intent = new Intent(Menu.this, Marcas.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu2LL ( ){
        Intent intent = new Intent(Menu.this, Stock.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu3LL (){
        Intent intent = new Intent(Menu.this, Programacion.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu4LL (){
        Intent intent = new Intent(Menu.this, Personal.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu5LL (){
        Intent intent = new Intent(Menu.this, Breaks.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu6LL (){
        Intent intent = new Intent(Menu.this, llavesAsig.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }
}