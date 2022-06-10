package com.example.screeningapp.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.screeningapp.Modelos.PersonalResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.RetrofitData.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PersonalDetails extends AppCompatActivity {

    TextView IDPE;
    EditText NombrePE, Paterno, Materno, DNI, Correo;
    RadioButton Rol1, Rol2, ActivoPE, InactivoPE;
    SwitchCompat ActiPer;
    Button ActuPer;
    PersonalResponse personalResponse;
    String IDper, NomPer, Patr, Matr, Doc, Email, PerRol, PerEst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        IDPE = findViewById(R.id.IDPE);
        NombrePE = findViewById(R.id.NombrePE);
        Paterno = findViewById(R.id.Paterno);
        Materno = findViewById(R.id.Materno);
        DNI = findViewById(R.id.DNI);
        Correo = findViewById(R.id.Correo);
        Rol1 = findViewById(R.id.Rol1);
        Rol2 = findViewById(R.id.Rol2);
        ActivoPE = findViewById(R.id.ActivoPE);
        InactivoPE = findViewById(R.id.InactivoPE);
        ActiPer = findViewById(R.id.ActiPer);
        ActuPer = findViewById(R.id.ActuPer);


        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            personalResponse = (PersonalResponse) intent.getSerializableExtra("datoPers");

            String id_pers = personalResponse.getId_personal();
            String nombrPE = personalResponse.getNombres();
            String patern = personalResponse.getApelli_paterno();
            String matern = personalResponse.getApelli_materno();
            String dniPE = personalResponse.getDNI();
            String correoPE = personalResponse.getCorreo();
            String rolPE = personalResponse.getRol();
            String estadoPE = personalResponse.getEstado();


            IDPE.setText(id_pers);
            NombrePE.setText(nombrPE);
            Paterno.setText(patern);
            Materno.setText(matern);
            DNI.setText(dniPE);
            Correo.setText(correoPE);


            if(rolPE.equals("1")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                Rol1.setChecked(true);
            }else if(rolPE.equals("2")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                Rol2.setChecked(true);
            }

            if(estadoPE.equals("1")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                ActivoPE.setChecked(true);
            }else if(estadoPE.equals("2")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                InactivoPE.setChecked(true);
            }


        }

        ActuPer.setOnClickListener(view -> ConfirmarPersonal());

    }

    public void ActiPers(View view){
        if (ActiPer.isChecked()){
            NombrePE.setEnabled(true);
            Paterno.setEnabled(true);
            Materno.setEnabled(true);
            DNI.setEnabled(true);
            Correo.setEnabled(true);
            Rol1.setEnabled(true);
            Rol2.setEnabled(true);
            ActivoPE.setEnabled(true);
            InactivoPE.setEnabled(true);
            ActuPer.setEnabled(true);
        }else{
            NombrePE.setEnabled(false);
            Paterno.setEnabled(false);
            Materno.setEnabled(false);
            DNI.setEnabled(false);
            Correo.setEnabled(false);
            Rol1.setEnabled(false);
            Rol2.setEnabled(false);
            ActivoPE.setEnabled(false);
            InactivoPE.setEnabled(false);
            ActuPer.setEnabled(false);
        }
    }

    public void ConfirmarPersonal(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Actualizar Datos del Personal?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> UDPers());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void UDPers() {
        if(Rol1.isChecked()){
            PerRol = "1";
        }else if (Rol2.isChecked()) {
            PerRol = "2";
        }
        if(ActivoPE.isChecked()){
            PerEst = "1";
        } else if(InactivoPE.isChecked()){
            PerEst = "2";
        }

        if(IDPE.getText().toString().isEmpty()){
            IDPE.setError("Ingrese Datos");
        }else if(NombrePE.getText().toString().isEmpty()){
            NombrePE.setError("Ingrese Datos");
        }else if(Paterno.getText().toString().isEmpty()){
            Paterno.setError("Ingrese Datos");
        }else if(Materno.getText().toString().isEmpty()){
            Materno.setError("Ingrese Datos");
        }else if(DNI.getText().toString().isEmpty()){
            DNI.setError("Ingrese Datos");
        }else if(Correo.getText().toString().isEmpty()){
            Correo.setError("Ingrese Datos");
        }else {

            IDper = IDPE.getText().toString();
            NomPer = NombrePE.getText().toString();
            Patr =Paterno.getText().toString();
            Matr = Materno.getText().toString();
            Doc = DNI.getText().toString();
            Email = Correo.getText().toString();

            Call<PersonalResponse> udPEr = ApiClient.getUserService().UDPers(IDper,NomPer,Patr,Matr,Doc,Email,PerRol,PerEst);
            udPEr.enqueue(new Callback<PersonalResponse>() {
                @Override
                public void onResponse(Call<PersonalResponse> call, Response<PersonalResponse> response) {
                    if (response.isSuccessful()) {
                        PersonalResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(PersonalDetails.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        PersonalResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(PersonalDetails.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onFailure(Call<PersonalResponse> call, Throwable t) {
                    Toast.makeText(PersonalDetails.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}