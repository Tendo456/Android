package com.example.laboratoriomolecular.Actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.laboratoriomolecular.Adaptador.AlicuotadoAdapter;
import com.example.laboratoriomolecular.Adaptador.AreaAdapter;
import com.example.laboratoriomolecular.R;
import com.loopj.android.http.AsyncHttpClient;

public class area_limpia extends AppCompatActivity {

    Spinner spPlacasAr,spOperAr;
    TextView Arid_placa, Arid_placaSp, Arq_muestras, Arf_inicio, Arh_inicio, Arf_final, Arh_final, Arpromedio, Aroperador ,Ardni;
    //dialogo
    TextView diArN_placa,diArq_muestras,diArf_inicio,diArh_inicio,diArf_final,diArh_final,diArpromedio,diAroperador,diArdni,diArestado;
    private AsyncHttpClient operadorAre;
    private AsyncHttpClient placaAre;
    AreaAdapter areaAdapter;
    RecyclerView ListArea;
    String idAr, placaAr, muestrasAr, f_inicioAr, h_inicioAr, f_finalAr, h_finalAr, promedioAr ,operadorAr, dniAr,id_placaAr, estadoAr;
    String ArF, ArH, ArN_placaF,ArN_placaI;
    String CAr_fhi, CAr_fhf;
    Button Ariniciar,Arfinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_limpia);

        spPlacasAr = findViewById(R.id.spPlacasAr);
        spOperAr = findViewById(R.id.spOperAr);
        Arid_placa = findViewById(R.id.Arid_placa);
        Arid_placaSp = findViewById(R.id.Arid_placaSp);

    }
}