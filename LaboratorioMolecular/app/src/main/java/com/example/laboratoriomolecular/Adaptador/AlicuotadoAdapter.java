package com.example.laboratoriomolecular.Adaptador;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Modelos.AlicuotadoResponse;
import com.example.laboratoriomolecular.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AlicuotadoAdapter extends RecyclerView.Adapter<AlicuotadoAdapter.AlicuotadoAdapterVH> {

    private List<AlicuotadoResponse> alicuotadoResponseList;
    private Context contextA;
    private ClickedItemA clickedItemA;

    public AlicuotadoAdapter(ClickedItemA clickedItemA){this.clickedItemA=clickedItemA;}

    public void setData(List<AlicuotadoResponse> alicuotadoResponseList){
        this.alicuotadoResponseList = alicuotadoResponseList;
        notifyDataSetChanged();
    }

    @NotNull
    @Override
    public AlicuotadoAdapterVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        contextA = parent.getContext();
        return new AlicuotadoAdapterVH(LayoutInflater.from(contextA).inflate(R.layout.row_users, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AlicuotadoAdapterVH holder, int position) {

        AlicuotadoResponse alicuotadoResponse = alicuotadoResponseList.get(position);

        String date = alicuotadoResponse.getN_placa();
        String prefix = alicuotadoResponse.getId_alicuotado();

        holder.prefix.setText(prefix);
        holder.dateA.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemA.ClickedAlicuotado(alicuotadoResponse));

    }

    public interface ClickedItemA{
        void ClickedAlicuotado(AlicuotadoResponse alicuotadoResponse);
    }

    @Override
    public int getItemCount() { return alicuotadoResponseList.size(); }

    public static class AlicuotadoAdapterVH extends RecyclerView.ViewHolder {

        TextView dateA;
        TextView prefix;
        ImageView imagemore;

        public AlicuotadoAdapterVH(@NotNull View itemView) {
            super(itemView);

            dateA = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
