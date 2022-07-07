package com.example.reportes.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.animation.content.Content;
import com.example.reportes.Modelos.ControlHoraResponse;
import com.example.reportes.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ControlHoraAdapter extends RecyclerView.Adapter<ControlHoraAdapter.ControlHoraAdapterVH>{

    private List<ControlHoraResponse> controlHoraResponseList;
    private Context contextCH;
    //private ClickedItemCH clickedItemCH;
    ArrayList<ControlHoraResponse> buscarCH;

    public ControlHoraAdapter(){
    }

    public void setData(List<ControlHoraResponse> controlHoraResponseList){
        this.controlHoraResponseList = controlHoraResponseList;
        buscarCH = new ArrayList<>();
        buscarCH.addAll(controlHoraResponseList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ControlHoraAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextCH = parent.getContext();
        return new ControlHoraAdapterVH(LayoutInflater.from(contextCH).inflate(R.layout.row_time,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ControlHoraAdapterVH holder, int position) {
        ControlHoraResponse controlHoraResponse = controlHoraResponseList.get(position);

        String nom = controlHoraResponse.getNombres();
        String apell1 = controlHoraResponse.getApelli_paterno();
        String apell2 = controlHoraResponse.getApelli_materno();
        String hor1 = controlHoraResponse.getSalida();
        String hor2 = controlHoraResponse.getRegreso();
        String v = String.valueOf(position+1);

        holder.prefix.setText(v);
        holder.Names.setText(nom+" "+apell1+" "+apell2);
        holder.hora1.setText(hor1);
        holder.hora2.setText(hor2);

    }

    public void filtrar (String searchCH){
        int large = searchCH.length();
        if(large == 0){
            controlHoraResponseList.clear();
            controlHoraResponseList.addAll(buscarCH);
        }else {
            List<ControlHoraResponse> collector = controlHoraResponseList.stream()
                    .filter(i -> i.getApelli_paterno().toLowerCase().contains(searchCH.toLowerCase()))
                    .collect(Collectors.toList());
            controlHoraResponseList.clear();
            controlHoraResponseList.addAll(collector);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return controlHoraResponseList.size();
    }

    public class ControlHoraAdapterVH extends RecyclerView.ViewHolder {

        TextView Names;
        TextView prefix;
        TextView hora1;
        TextView hora2;

        public ControlHoraAdapterVH(@NonNull View itemView) {
            super(itemView);

            Names = itemView.findViewById(R.id.Names);
            prefix = itemView.findViewById(R.id.prefix);
            hora1 = itemView.findViewById(R.id.hora1);
            hora2 = itemView.findViewById(R.id.hora2);


        }
    }

}
