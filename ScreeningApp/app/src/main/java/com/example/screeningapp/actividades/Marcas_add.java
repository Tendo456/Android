package com.example.screeningapp.actividades;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.screeningapp.Modelos.MarcasResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.RetrofitData.ApiClient;

import org.jetbrains.annotations.NotNull;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Marcas_add extends AppCompatActivity {

    EditText sendMarca;
    TextView sendFecha;
    RadioButton sendGalleta, sendBebida;
    RadioButton sendActivo, sendInactivo;
    Button GuardarMarca;
    String sendMarcaSt,sendFechaSt,sendTipo,sendEstado;
    String fechaT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas_add);

        sendMarca = findViewById(R.id.sendMarca);
        sendFecha = findViewById(R.id.sendFecha);
        sendGalleta = findViewById(R.id.sendGalleta);
        sendBebida = findViewById(R.id.sendBebida);
        sendActivo = findViewById(R.id.sendActivo);
        sendInactivo = findViewById(R.id.sendInactivo);
        GuardarMarca = findViewById(R.id.GuardarMarca);

        fechaADDM();

        GuardarMarca.setOnClickListener(v -> ConfirmarMarca());
    }

    public void fechaADDM (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        fechaT = formatter.format(calendar.getTime());
        sendFecha.setText(fechaT);

    }

    public void ConfirmarMarca (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Agregar Marca?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> saveMarca());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void saveMarca (){
        fechaADDM();

        sendMarcaSt = sendMarca.getText().toString();
        sendFechaSt = sendFecha.getText().toString();

        if(sendGalleta.isChecked()){
            sendTipo = "1";
        }else if(sendBebida.isChecked()){
            sendTipo ="2";
        }

        if(sendActivo.isChecked()){
            sendEstado = "1";
        }else if(sendInactivo.isChecked()){
            sendEstado ="2";
        }

        if(sendMarca.getText().toString().isEmpty()){
            sendMarca.setText("Vacío"); }
        else if (sendFecha.getText().toString().isEmpty()){
            sendFecha.setError("Complete los campos");

        } else {

            Call<MarcasResponse> call = ApiClient.getUserService().InsertarMarca(sendMarcaSt,sendFechaSt,sendTipo,sendEstado);
            call.enqueue(new Callback<MarcasResponse>() {
                @Override
                public void onResponse(@NotNull Call<MarcasResponse> call, @NotNull Response<MarcasResponse> response) {
                    if (response.isSuccessful()) {
                        MarcasResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Marcas_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        MarcasResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(Marcas_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NotNull Call<MarcasResponse> call, @NotNull Throwable t) {
                    Toast.makeText(Marcas_add.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}