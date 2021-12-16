package com.example.breaks.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.breaks.Modelos.MarcasResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MarcasDetails extends AppCompatActivity {

    EditText UDIdMarca, UDMarca, UDStock;
    TextView UDFecha;
    RadioButton UDGalleta, UDBebida;
    RadioButton UDActivo, UDInactivo;
    Button AtcMarca;
    String idMarc,UDMarcaSt,UDFechaSt,UDTipo,UDEstado;
    MarcasResponse marcasResponse;
    SwitchCompat activarM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas_details);

        UDIdMarca = findViewById(R.id.UDIdMarca);
        UDMarca = findViewById(R.id.UDMarca);
        UDFecha = findViewById(R.id.UDFecha);
        UDGalleta = findViewById(R.id.UDGalleta);
        UDBebida = findViewById(R.id.UDBebida);
        UDActivo = findViewById(R.id.UDActivo);
        UDInactivo = findViewById(R.id.UDInactivo);
        AtcMarca = findViewById(R.id.ActMarca);
        activarM = findViewById(R.id.activarM);

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            marcasResponse = (MarcasResponse) intent.getSerializableExtra("data");

            String idMarca = marcasResponse.getId_marcas();
            String Marca = marcasResponse.getMarca();
            String Fecha = marcasResponse.getFecha();
            String Tipo = marcasResponse.getTipo();
            String Estado = marcasResponse.getEstado();


            UDIdMarca.setText(idMarca);
            UDMarca.setText(Marca);
            UDFecha.setText(Fecha);

            if(Tipo.equals("1")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                UDGalleta.setChecked(true);
            }else if(Tipo.equals("2")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                UDBebida.setChecked(true);
            }

            if(Estado.equals("1")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                UDActivo.setChecked(true);
            }else if(Estado.equals("2")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                UDInactivo.setChecked(true);
            }
        }

        fechaMD();
        AtcMarca.setOnClickListener(view -> ConfirmarAtcMarca());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MarcasDetails.this, Marcas.class);
        startActivity(intent);

        finish();
    }

    public void fechaMD (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        UDFechaSt = formatter.format(calendar.getTime());
        //Toast.makeText(MarcasDetails.this, ""+UDFechaSt, Toast.LENGTH_SHORT).show();
    }

    public void activarCampos(View view){
        if(activarM.isChecked()){
            UDMarca.setEnabled(true);
            UDGalleta.setEnabled(true);
            UDBebida.setEnabled(true);
            UDActivo.setEnabled(true);
            UDInactivo.setEnabled(true);

        }else {
            UDMarca.setEnabled(false);
            UDGalleta.setEnabled(false);
            UDBebida.setEnabled(false);
            UDActivo.setEnabled(false);
            UDInactivo.setEnabled(false);
        }
    }


    public void ConfirmarAtcMarca (){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Actualizar Marca?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> UPMarcas());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void UPMarcas(){

        fechaMD();

        idMarc = UDIdMarca.getText().toString();
        UDMarcaSt = UDMarca.getText().toString();
        //UDFechaSt = UDFecha.getText().toString();

        if(UDGalleta.isChecked()){
            UDTipo = "1";
        }else if(UDBebida.isChecked()){
            UDTipo ="2";
        }

        if(UDActivo.isChecked()){
            UDEstado = "1";
        }else if(UDInactivo.isChecked()){
            UDEstado ="2";
        }

        if(UDMarca.getText().toString().isEmpty()){
            UDMarca.setText("Vacío"); }
        else if (UDFecha.getText().toString().isEmpty()){
            UDFecha.setError("Complete los campos");

        } else {

            Call<MarcasResponse> UPDateMarcas = ApiClient.getUserService().UDMarca(idMarc, UDMarcaSt, UDFechaSt, UDTipo, UDEstado);
            UPDateMarcas.enqueue(new Callback<MarcasResponse>() {
                @Override
                public void onResponse(@NonNull Call<MarcasResponse> call, @NonNull Response<MarcasResponse> response) {
                    if (response.isSuccessful()) {
                        MarcasResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(MarcasDetails.this, "" + mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MarcasDetails.this, Marcas.class);
                        startActivity(intent);

                        finish();
                    } else {
                        MarcasResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(MarcasDetails.this, "" + mensaje.getMensaje() + response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<MarcasResponse> call, @NonNull Throwable t) {
                    Toast.makeText(MarcasDetails.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }




}