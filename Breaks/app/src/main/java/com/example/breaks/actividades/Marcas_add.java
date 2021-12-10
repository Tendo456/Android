package com.example.breaks.actividades;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.breaks.Modelos.MarcasResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Marcas_add extends AppCompatActivity {

    EditText sendMarca,sendStock;
    TextView sendFecha;
    RadioButton sendGalleta, sendBebida;
    RadioButton sendActivo, sendInactivo;
    Button GuardarMarca;
    String sendMarcaSt,sendStockSt,sendFechaSt,sendTipo,sendEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas_add);

        sendMarca = findViewById(R.id.sendMarca);
        sendStock = findViewById(R.id.sendStock);
        sendFecha = findViewById(R.id.sendFecha);
        sendGalleta = findViewById(R.id.sendGalleta);
        sendBebida = findViewById(R.id.sendBebida);
        sendActivo = findViewById(R.id.sendActivo);
        sendInactivo = findViewById(R.id.sendInactivo);
        GuardarMarca = findViewById(R.id.GuardarMarca);

        GuardarMarca.setOnClickListener(v -> ConfirmarMarca());
    }

    public void ConfirmarMarca (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Enviar los Datos?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> saveMarca());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    private void saveMarca (){

        sendMarcaSt = sendMarca.getText().toString();
        sendStockSt = sendStock.getText().toString();
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
        if (sendStock.getText().toString().isEmpty()){
            sendStock.setError("Complete los campos");
        }else if (sendFecha.getText().toString().isEmpty()){
            sendFecha.setError("Complete los campos");

        } else {

            Call<MarcasResponse> call = ApiClient.getUserService().InsertarMarca(sendMarcaSt,sendStockSt,sendFechaSt,sendTipo,sendEstado);
            call.enqueue(new Callback<MarcasResponse>() {
                @Override
                public void onResponse(@NotNull Call<MarcasResponse> call, @NotNull Response<MarcasResponse> response) {
                    if (response.isSuccessful()) {
                        MarcasResponse mensaje = response.body();
                        Toast.makeText(Marcas_add.this, ""+mensaje.getMensaje()+" "+response.code(), Toast.LENGTH_SHORT).show();
                        //limpiar();
                        //getAllRecepcion();
                    } else {
                        Toast.makeText(Marcas_add.this, "Error al Guardar los Datos " +response.code(), Toast.LENGTH_SHORT).show();
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