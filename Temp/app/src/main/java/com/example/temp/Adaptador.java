package com.example.temp;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.logging.LogRecord;

public class Adaptador extends ArrayAdapter<Personal>{

    Context context;
    List<Personal>arraylistaPerso;

    public Adaptador(@NonNull Context context, List<Personal>arraylistaPerso) {
        super(context,R.layout.items,arraylistaPerso);

        this.context=context;
        this.arraylistaPerso = arraylistaPerso;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,null,true);

        TextView tvID = view.findViewById(R.id.txtId);
        TextView tvNombre = view.findViewById(R.id.txtNombre);
        TextView tvTemperatura1 = view.findViewById(R.id.txtTemp1);
        TextView tvTemperatura2 = view.findViewById(R.id.txtTemp2) ;

        tvID.setText(arraylistaPerso.get(position).getId_personal());
        tvNombre.setText(arraylistaPerso.get(position).getNombres());
        tvTemperatura1.setText(arraylistaPerso.get(position).getTemperatura1());
        tvTemperatura2.setText(arraylistaPerso.get(position).getTemperatura2());

        return view;


    }


}
