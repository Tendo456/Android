package com.example.screeningapp.actividades;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.screeningapp.Modelos.PersonalResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.RetrofitData.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Personal_add extends AppCompatActivity {

    EditText AddNombrePE,AddPaterno,AddMaterno,AddDNI,AddCorreo;
    RadioButton AddRol1, AddRol2, AddActivoPE, AddInactivoPE;
    Button AddSavePer;
    String ADDNom, ADDPat, ADDMat, ADDDNIPE, ADDCor, rolPE, actPE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_add);

        AddNombrePE = findViewById(R.id.AddNombrePE);
        AddPaterno = findViewById(R.id.AddPaterno);
        AddMaterno = findViewById(R.id.AddMaterno);
        AddDNI = findViewById(R.id.AddDNI);
        AddCorreo = findViewById(R.id.AddCorreo);
        AddRol1 = findViewById(R.id.AddRol1);
        AddRol2 = findViewById(R.id.AddRol2);
        AddActivoPE = findViewById(R.id.AddActivoPE);
        AddInactivoPE = findViewById(R.id.AddInactivoPE);
        AddSavePer = findViewById(R.id.AddSavePer);

        AddSavePer.setOnClickListener(view -> ConfirmarPers());

    }

    public void ConfirmarPers (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Personal?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> savePers());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }


    public void savePers(){

        if(AddRol1.isChecked()){
            rolPE = "1";
        }else if (AddRol2.isChecked()) {
            rolPE = "2";
        }
        if(AddActivoPE.isChecked()){
            actPE = "1";
        } else if(AddInactivoPE.isChecked()){
            actPE = "2";
        }

        if(AddNombrePE.getText().toString().isEmpty()){
            AddNombrePE.setError("Ingrese Datos");
        }else if(AddPaterno.getText().toString().isEmpty()){
            AddPaterno.setError("Ingrese Datos");
        }else if(AddMaterno.getText().toString().isEmpty()){
            AddMaterno.setError("Ingrese Datos");
        }else if(AddDNI.getText().toString().isEmpty()){
            AddDNI.setError("Ingrese Datos");
        }else if(AddCorreo.getText().toString().isEmpty()){
            AddCorreo.setError("Ingrese Datos");
        }else {

            ADDNom = AddNombrePE.getText().toString();
            ADDPat = AddPaterno.getText().toString();
            ADDMat = AddMaterno.getText().toString();
            ADDDNIPE = AddDNI.getText().toString();
            ADDCor = AddCorreo.getText().toString();

            Call<PersonalResponse> addPE = ApiClient.getUserService().ADDPers(ADDNom,ADDPat,ADDMat,ADDDNIPE,ADDCor,rolPE,actPE);
            addPE.enqueue(new Callback<PersonalResponse>() {
                @Override
                public void onResponse(Call<PersonalResponse> call, Response<PersonalResponse> response) {
                    if (response.isSuccessful()) {
                        PersonalResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Personal_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        PersonalResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Personal_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<PersonalResponse> call, Throwable t) {
                    Toast.makeText(Personal_add.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}