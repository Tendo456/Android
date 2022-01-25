package com.example.breaks.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Modelos.BreaksResponse;
import com.example.breaks.R;

import java.util.List;

public class BreaksAdapter extends RecyclerView.Adapter<BreaksAdapter.BreaksAdapterVH> {

    private List<BreaksResponse> breaksResponseList;
    private Context contextB;
    //private ClickedItemB clickedItemB;

    public BreaksAdapter() {

    }

    public void setData(List<BreaksResponse> breaksResponseList){
        this.breaksResponseList = breaksResponseList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public BreaksAdapter.BreaksAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextB = parent.getContext();
        return new BreaksAdapter.BreaksAdapterVH(LayoutInflater.from(contextB).inflate(R.layout.row_breaks,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull BreaksAdapter.BreaksAdapterVH holder, int position) {
        BreaksResponse breaksResponse = breaksResponseList.get(position);

        String nom = breaksResponse.getNombres();
        String prefix = breaksResponse.getId_breaks();
        String time = breaksResponse.getHora_break();
        String cant = breaksResponse.getCantidad();
        String apell1 = breaksResponse.getApelli_paterno();
        String apell2 = breaksResponse.getApelli_materno();
        String v = "";

        v = String.valueOf(position+1);

        holder.prefix.setText(v);
        holder.Names.setText(nom+" "+apell1+" "+apell2);
        holder.hora.setText(time);
        holder.Cantidad.setText("Breaks: "+cant);

    }

    @Override
    public int getItemCount() {
        return breaksResponseList.size();
    }

    public class BreaksAdapterVH extends RecyclerView.ViewHolder {

        TextView Names;
        TextView prefix;
        TextView hora;
        TextView Cantidad;



        public BreaksAdapterVH(@NonNull View itemView) {
            super(itemView);

            Names = itemView.findViewById(R.id.Names);
            prefix = itemView.findViewById(R.id.prefix);
            hora = itemView.findViewById(R.id.hora);
            Cantidad = itemView.findViewById(R.id.Cantidad);
        }
    }
}
