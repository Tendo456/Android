package com.example.screeningapp.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screeningapp.Modelos.PersonalResponse;
import com.example.screeningapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonalAdapter extends RecyclerView.Adapter<PersonalAdapter.PersonalAdapterVH> {

    private List<PersonalResponse> personalResponseList;
    private Context contextPE;
    private ClickedItemPE clickedItemPE;
    ArrayList<PersonalResponse> buscar;

    public PersonalAdapter(ClickedItemPE clickedItemPE) {this.clickedItemPE = clickedItemPE;
    }

    public void setData(List<PersonalResponse> personalResponseList){
        this.personalResponseList = personalResponseList;

        buscar = new ArrayList<>();
        buscar.addAll(personalResponseList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonalAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextPE = parent.getContext();
        return new PersonalAdapterVH(LayoutInflater.from(contextPE).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalAdapterVH holder, int position) {
        PersonalResponse personalResponse = personalResponseList.get(position);

        String paterno = personalResponse.getApelli_paterno();
        String materno = personalResponse.getApelli_materno();
        String date = personalResponse.getNombres();
        String prefix = personalResponse.getId_personal();

        holder.prefix.setText(prefix);
        holder.dateAm.setText(date+" "+paterno+" "+materno);
        holder.imagemore.setOnClickListener(v -> clickedItemPE.ClickedPer(personalResponse));
    }

    public void filter(String BuscarPer){
        int longitud = BuscarPer.length();
        if(longitud == 0){
            personalResponseList.clear();
            personalResponseList.addAll(buscar);
        }else{
            List<PersonalResponse> collection = personalResponseList.stream()
                    .filter(i -> i.getApelli_paterno().toLowerCase().contains(BuscarPer.toLowerCase()))
                    .collect(Collectors.toList());
            personalResponseList.clear();
            personalResponseList.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public interface ClickedItemPE {
        void ClickedPer(PersonalResponse personalResponse);
    }

    @Override
    public int getItemCount() {
        return personalResponseList.size();
    }

    public class PersonalAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAm;
        TextView prefix;
        ImageView imagemore;

        public PersonalAdapterVH(@NonNull View itemView) {
            super(itemView);

            dateAm = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
