package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.breaks.Modelos.ProgramacionResponse;
import com.example.breaks.Modelos.StockResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProgramacionDetails extends AppCompatActivity {

    TextView PROGID, PROGMarcaD, PROGFechaD;
    EditText PROGCantD;
    SwitchCompat ActiPROG;
    Button ActuPROG;
    ProgramacionResponse programacionResponse;
    String ProgIDD, ProgCantD, ProgFechaD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacion_details);

        PROGID = findViewById(R.id.PROGID);
        PROGMarcaD = findViewById(R.id.PROGMarcaD);
        PROGFechaD = findViewById(R.id.PROGFechaD);
        PROGCantD = findViewById(R.id.PROGCantD);
        ActuPROG = findViewById(R.id.ActuPROG);
        ActiPROG = findViewById(R.id.ActiPROG);


        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            programacionResponse = (ProgramacionResponse) intent.getSerializableExtra("datoProg");

            String id_prog = programacionResponse.getId_programacion();
            String marcaPROG = programacionResponse.getMarca();
            String cant = programacionResponse.getCantidad_marc();
            String fecha_prog = programacionResponse.getFecha_prog();


            PROGID.setText(id_prog);
            PROGMarcaD.setText(marcaPROG);
            PROGCantD.setText(cant);
            PROGFechaD.setText(fecha_prog);
        }

        fechaPGD();
        ActuPROG.setOnClickListener(view -> ConfirmarPG());
    }

    public void fechaPGD (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        ProgFechaD = formatter.format(calendar.getTime());
        //Toast.makeText(MarcasDetails.this, ""+UDFechaSt, Toast.LENGTH_SHORT).show();
    }

    public void ActivarProg (View view){
        if(ActiPROG.isChecked()){
            PROGCantD.setEnabled(true);
        }else {
            PROGCantD.setEnabled(false);
        }
    }

    public void ConfirmarPG(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Actualizar Programación?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> UPProg());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void UPProg(){
        fechaPGD();

        ProgIDD = PROGID.getText().toString();
        ProgCantD = PROGCantD.getText().toString();

        if (PROGCantD.getText().toString().isEmpty()){
            PROGCantD.setError("Ingrese una Cantidad");
        }else {
            Call<ProgramacionResponse> udPG = ApiClient.getUserService().UDProg(ProgIDD,ProgCantD,ProgFechaD);
            udPG.enqueue(new Callback<ProgramacionResponse>() {
                @Override
                public void onResponse(@NonNull Call<ProgramacionResponse> call, @NonNull Response<ProgramacionResponse> response) {
                    if (response.isSuccessful()) {
                        ProgramacionResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(ProgramacionDetails.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();

                    } else {
                        ProgramacionResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(ProgramacionDetails.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<ProgramacionResponse> call, @NonNull Throwable t) {
                    Toast.makeText(ProgramacionDetails.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}