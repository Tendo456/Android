package com.example.breaks.actividades;

import android.annotation.SuppressLint;
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

import com.example.breaks.Modelos.StockResponse;
import com.example.breaks.R;
import com.example.breaks.RetrofitData.ApiClient;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StockDetails extends AppCompatActivity {

    TextView STID, STMarcaD, STFechaD;
    EditText UDStock_cant, UDStock_ini;
    SwitchCompat ActiST;
    Button ActuST;
    StockResponse stockResponse;
    String StkID, Stk_ini,Stk_cant, StkFecha,StkEst;
    RadioButton UDActivoSK, UDInactivoSK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_details);

        STID = findViewById(R.id.STID);
        STMarcaD = findViewById(R.id.STMarcaD);
        STFechaD = findViewById(R.id.STFechaD);
        UDStock_ini = findViewById(R.id.UDStock_ini);
        UDStock_cant = findViewById(R.id.UDStock_cant);
        ActiST = findViewById(R.id.ActiST);
        ActuST = findViewById(R.id.ActuST);
        UDActivoSK = findViewById(R.id.UDActivoSK);
        UDInactivoSK = findViewById(R.id.UDInactivoSK);

        Intent intent = getIntent();
        if(intent.getExtras() !=null) {
            stockResponse = (StockResponse) intent.getSerializableExtra("datoStock");

            String id_stock = stockResponse.getId_stock();
            String marcaST = stockResponse.getMarca();
            String stock_ini = stockResponse.getStock_ini();
            String stock_cant = stockResponse.getStock_cant();
            String fecha_s = stockResponse.getFecha_s();
            String estadoSK = stockResponse.getEstadoSK();

            STID.setText(id_stock);
            STMarcaD.setText(marcaST);
            UDStock_ini.setText(stock_ini);
            UDStock_cant.setText(stock_cant);
            STFechaD.setText(fecha_s);

            if(estadoSK.equals("1")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                UDActivoSK.setChecked(true);
            }else if(estadoSK.equals("2")){
                //Toast.makeText(MarcasDetails.this, "valor"+Tipo ,Toast.LENGTH_SHORT).show();
                UDInactivoSK.setChecked(true);
            }
        }

        fechaSD();

        ActuST.setOnClickListener(view -> ConfirmarST());
    }

    public void fechaSD (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        StkFecha = formatter.format(calendar.getTime());
        //Toast.makeText(MarcasDetails.this, ""+UDFechaSt, Toast.LENGTH_SHORT).show();
    }

    public void ActivarStock (View view){
        if(ActiST.isChecked()){
            UDStock_ini.setEnabled(true);
            UDStock_cant.setEnabled(true);
            UDActivoSK.setEnabled(true);
            UDInactivoSK.setEnabled(true);
        }else {
            UDStock_ini.setEnabled(false);
            UDStock_cant.setEnabled(false);
            UDActivoSK.setEnabled(true);
            UDInactivoSK.setEnabled(true);
        }
    }

    public void ConfirmarST(){
        AlertDialog.Builder opcion = new AlertDialog.Builder(this);
        opcion.setMessage("Actualizar Stock?");
        opcion.setPositiveButton("Enviar", (dialog, which) -> UPStock());
        opcion.setNegativeButton("Cancelar", (dialog, which) -> dialog.cancel());

        AlertDialog dialog = opcion.create();
        dialog.show();
    }

    public void UPStock(){

        fechaSD();

        StkID = STID.getText().toString();
        Stk_ini = UDStock_ini.getText().toString();
        Stk_cant = UDStock_cant.getText().toString();

        if(UDActivoSK.isChecked()){
            StkEst = "1";
        }else if(UDInactivoSK.isChecked()){
            StkEst ="2";
        }

        if (UDStock_ini.getText().toString().isEmpty()){
            UDStock_ini.setError("Complete los campos");
        }else if (UDStock_cant.getText().toString().isEmpty()){
            UDStock_cant.setError("Complete los campos");
        } else {

            Call<StockResponse> UDTStock = ApiClient.getUserService().UDStock(StkID, Stk_ini,Stk_cant, StkFecha,StkEst);
            UDTStock.enqueue(new Callback<StockResponse>() {
                @Override
                public void onResponse(Call<StockResponse> call, Response<StockResponse> response) {
                    if (response.isSuccessful()) {
                        StockResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(StockDetails.this, "" + mensaje.getMensaje() + " " + response.code(), Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(StockDetails.this, Stock.class);
                        startActivity(intent);

                        finish();
                    } else {
                        StockResponse mensaje = response.body();
                        assert mensaje != null;
                        Toast.makeText(StockDetails.this, "" + mensaje.getMensaje() + response.code(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<StockResponse> call, Throwable t) {
                    Toast.makeText(StockDetails.this, "Error " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}