package com.example.reportes.Actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.reportes.Modelos.PersonalResponse;
import com.example.reportes.R;
import com.example.reportes.RetrofitData.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Menu extends AppCompatActivity {

    ImageView menu1, menu2;
    String emailuserME;
    String corr, rol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        emailuserME = getIntent().getStringExtra("EmailUser");
        menu1 = findViewById(R.id.menu1);
        menu2 = findViewById(R.id.menu2);

        menu1.setOnClickListener(view -> menu1LL());
        menu2.setOnClickListener(view -> menu2LL());

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

                    }else if(rol1.equals("1") || rol1.equals("3")) {
                        menu1.setEnabled(true);
                        menu2.setEnabled(true);

                    }else if(rol1.equals("2")){
                        menu1.setEnabled(false);
                        menu2.setEnabled(false);

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
        Intent intent = new Intent(Menu.this, ControlHora.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);
    }

    public void menu2LL ( ){
        Toast.makeText(Menu.this, "No Disponible", Toast.LENGTH_SHORT).show();
        /*Intent intent = new Intent(Menu.this, ControlHora.class);
        //intent.putExtra("DisplayUser",nombre.getText().toString());
        intent.putExtra("EmailUser",emailuserME);
        startActivity(intent);*/
    }
}