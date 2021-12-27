package com.example.breaks.actividades;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    EditText UDStock;
    SwitchCompat ActiST;
    Button ActuST;
    StockResponse stockResponse;
    String StkID, Stk, StkFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_details);

        STID = findViewById(R.id.STID);
        STMarcaD = findViewById(R.id.STMarcaD);
        STFechaD = findViewById(R.id.STFechaD);
        UDStock = findViewById(R.id.UDStock);
        ActiST = findViewById(R.id.ActiST);
        ActuST = findViewById(R.id.ActuST);

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            stockResponse = (StockResponse) intent.getSerializableExtra("datoStock");

            String id_stock = stockResponse.getId_stock();
            String marcaST = stockResponse.getMarca();
            String stock = stockResponse.getStock();
            String fecha_s = stockResponse.getFecha_s();


            STID.setText(id_stock);
            STMarcaD.setText(marcaST);
            UDStock.setText(stock);
            STFechaD.setText(fecha_s);
        }

        fechaSD();

        ActuST.setOnClickListener(view -> ConfirmarST());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(StockDetails.this, Stock.class);
        startActivity(intent);
        //finish();
    }

    public void fechaSD (){
        final Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        StkFecha = formatter.format(calendar.getTime());
        //Toast.makeText(MarcasDetails.this, ""+UDFechaSt, Toast.LENGTH_SHORT).show();
    }

    public void ActivarStock (View view){
        if(ActiST.isChecked()){
            UDStock.setEnabled(true);
        }else {
            UDStock.setEnabled(false);
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
        Stk = UDStock.getText().toString();

        if (UDStock.getText().toString().isEmpty()){
            UDStock.setError("Complete los campos");
        }else {

            Call<StockResponse> UDTStock = ApiClient.getUserService().UDStock(StkID, Stk, StkFecha);
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