package com.example.getpost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class insert extends AppCompatActivity {

    TextInputEditText username, fname, lname, email,password;
    Button btn_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        username=findViewById(R.id.username);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        btn_reg=findViewById(R.id.btn_registrer);

        btn_reg.setOnClickListener(v -> {
            saveUser(createRequest());
        });
    }

    public UserRequest createRequest(){
        UserRequest userRequest = new UserRequest();
        userRequest.setUsername(username.getText().toString());
        userRequest.setEmail(email.getText().toString());
        userRequest.setLast_name(lname.getText().toString());
        userRequest.setFirst_name(fname.getText().toString());
        userRequest.setPassword(password.getText().toString());

        return userRequest;
    }

    public  void saveUser(UserRequest userRequest){
       Call<UserResponse> userResponseCall = ApiClient.getUserService().saveUser(userRequest);
       userResponseCall.enqueue(new Callback<UserResponse>() {
           @Override
           public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
               if(response.isSuccessful()){
                   Toast.makeText(insert.this, "Datos Guardados",Toast.LENGTH_SHORT).show();
               }else{
                   Toast.makeText(insert.this, "Error al Guardar 1",Toast.LENGTH_SHORT).show();
               }
           }

           @Override
           public void onFailure(Call<UserResponse> call, Throwable t) {

               Toast.makeText(insert.this, "Error al Guardar",Toast.LENGTH_SHORT).show();

           }
       });
    }
}