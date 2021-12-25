package com.example.breaks.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.breaks.Modelos.PersonalResponse;
import com.example.breaks.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class PersonalDetails extends AppCompatActivity {

    TextView IDPE;
    EditText NombrePE, Paterno, Materno, DNI, Correo;
    RadioButton Rol1, Rol2, ActivoPE, InactivoPE;
    SwitchCompat ActiPer;
    Button ActuPer;
    PersonalResponse personalResponse;

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
}