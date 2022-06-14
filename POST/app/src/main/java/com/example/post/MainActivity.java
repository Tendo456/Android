package com.example.post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextInputEditText username, fname, lname, email;
    Button btn_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        btn_reg=findViewById(R.id.btn_registrer);

        btn_reg.setOnClickListener(v -> {
            saveUser(createRequest());
        });
    }

    public UserRequest createRequest(){
        UserRequest userRequest = new UserRequest();
        userRequest.setUsername(Objects.requireNonNull(username.getText()).toString());
        userRequest.setEmail(Objects.requireNonNull(email.getText()).toString());
        userRequest.setLast_name(Objects.requireNonNull(lname.getText()).toString());
        userRequest.setFirst_name(Objects.requireNonNull(fname.getText()).toString());

        //Toast.makeText(MainActivity.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
        return userRequest;
    }

    public void saveUser(UserRequest userRequest){
        Call<UserResponse> userResponseCall = ApiClient.getUserService().saveUser(userRequest);
        userResponseCall.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Error al Guardar 1",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error al Guardar"+t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}