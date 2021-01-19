package com.example.ingreso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends ArrayAdapter<Users1>{

    Context context;
    List<Users1>arraylistaUsers;


    public Adaptador(@NonNull Context context, List<Users1>arraylistaUsers) {
        super(context,R.layout.my_list_item,arraylistaUsers);

        this.context=context;
        this.arraylistaUsers = arraylistaUsers;


    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list_item,null,true);

        TextView tvID = view.findViewById(R.id.txtId);
        TextView tvNombre = view.findViewById(R.id.txtNombres);
        TextView tvTemp1 = view.findViewById(R.id.tvTemp1);

        tvID.setText(arraylistaUsers.get(position).getId_Personal());
        tvNombre.setText(arraylistaUsers.get(position).getNombres());
        tvTemp1.setText(arraylistaUsers.get(position).getDni());

        return view;
    }
    
}