package com.example.screeningapp.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screeningapp.Modelos.MarcasResponse;
import com.example.screeningapp.R;

import java.util.List;

public class MarcasAdapter extends RecyclerView.Adapter<MarcasAdapter.MarcasAdapterVH> {

    private List<MarcasResponse> marcasResponseList;
    private Context contextM;
    private ClickedItemM clickedItemM;


    public MarcasAdapter(ClickedItemM clickedItemM) {
        this.clickedItemM = clickedItemM;
    }

    public void setData(List<MarcasResponse> marcasResponseList){
        this.marcasResponseList = marcasResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MarcasAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextM = parent.getContext();
        return new MarcasAdapterVH(LayoutInflater.from(contextM).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MarcasAdapterVH holder, int position) {
        MarcasResponse marcasResponse = marcasResponseList.get(position);

        String date = marcasResponse.getMarca();
        String prefix = marcasResponse.getId_marcas();

        holder.prefix.setText(prefix);
        holder.dateAm.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemM.ClickedMarca(marcasResponse));
    }

    public interface ClickedItemM{
        void ClickedMarca(MarcasResponse marcasResponse);
    }

    @Override
    public int getItemCount() {
        return marcasResponseList.size();
    }

    public class MarcasAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAm;
        TextView prefix;
        ImageView imagemore;

        public MarcasAdapterVH(@NonNull View itemView) {
            super(itemView);

            dateAm = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
