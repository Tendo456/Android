package com.example.screeningapp.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screeningapp.Modelos.BreaksResponse;
import com.example.screeningapp.R;
import com.example.screeningapp.Modelos.BreaksResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BreaksAdapter extends RecyclerView.Adapter<BreaksAdapter.BreaksAdapterVH> {

    private List<BreaksResponse> breaksResponseList;
    private Context contextB;
    //private ClickedItemB clickedItemB;
    ArrayList<BreaksResponse> buscarBKS;

    public BreaksAdapter() {

    }

    public void setData(List<BreaksResponse> breaksResponseList){
        this.breaksResponseList = breaksResponseList;

        buscarBKS = new ArrayList<>();
        buscarBKS.addAll(breaksResponseList);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public BreaksAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextB = parent.getContext();
        return new BreaksAdapterVH(LayoutInflater.from(contextB).inflate(R.layout.row_breaks,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull BreaksAdapterVH holder, int position) {
        BreaksResponse breaksResponse = breaksResponseList.get(position);

        String nom = breaksResponse.getNombres();
        String prefix = breaksResponse.getId_breaks();
        String time = breaksResponse.getHora_break();
        String cant = breaksResponse.getCantidad();
        String apell1 = breaksResponse.getApelli_paterno();
        String apell2 = breaksResponse.getApelli_materno();
        String v;
        String pre = "Breaks: ";

        v = String.valueOf(position+1);

        holder.prefix.setText(v);
        holder.Names.setText(nom+" "+apell1+" "+apell2);
        holder.hora.setText(time);
        holder.Cantidad.setText(pre+cant);
        if(cant.equals("2")){
            holder.Cantidad.setBackgroundResource(R.drawable.rectangulo_purple);
        }else if(cant.equals("3")){
            holder.Cantidad.setBackgroundResource(R.drawable.rectangulo_orange);
        }else if(cant.equals("4")){
            holder.Cantidad.setBackgroundResource(R.drawable.rectangulo_blue);
        }else if(cant.equals("5")){
            holder.Cantidad.setBackgroundResource(R.drawable.rectangulo_brown);
        }else {
            holder.Cantidad.setBackgroundResource(R.drawable.rectangulo_verde);
        }

    }

    public void filtrar (String searchBKS){
        int large = searchBKS.length();
        if(large == 0){
            breaksResponseList.clear();
            breaksResponseList.addAll(buscarBKS);
        }else{
            List<BreaksResponse> collector = breaksResponseList.stream()
                    .filter(i -> i.getApelli_paterno().toLowerCase().contains(searchBKS.toLowerCase()))
                    .collect(Collectors.toList());
            breaksResponseList.clear();
            breaksResponseList.addAll(collector);
        }
        notifyDataSetChanged();
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
