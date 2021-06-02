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
import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AlicuotadoAdapter extends RecyclerView.Adapter<AlicuotadoAdapter.AlicuotadorAdapterVH> {

    private List<AlicuotadoResponse> alicuotadoResponseList;
    private Context contextA;
    private ClickedItemA clickedItemA;

    public AlicuotadoAdapter(ClickedItemA clickedItemA){this.clickedItemA=clickedItemA;}

    public void setData(List<AlicuotadoResponse> alicuotadoResponseList){
        this.alicuotadoResponseList = alicuotadoResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @NotNull
    @Override
    public AlicuotadorAdapterVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        contextA = parent.getContext();
        return new AlicuotadoAdapter.AlicuotadorAdapterVH(LayoutInflater.from(contextA).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AlicuotadorAdapterVH holder, int position) {

        AlicuotadoResponse alicuotadoResponse = alicuotadoResponseList.get(position);

        String date = alicuotadoResponse.getN_placa();
        String prefix = alicuotadoResponse.getId_alicuotado();

        holder.prefix.setText(prefix);
        holder.dateA.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemA.ClickedAlicuotado(alicuotadoResponse));

    }

    public interface ClickedItemA{
        public void ClickedAlicuotado(AlicuotadoResponse alicuotadoResponse);
    }

    @Override
    public int getItemCount() { return alicuotadoResponseList.size(); }

    public class AlicuotadorAdapterVH extends RecyclerView.ViewHolder {

        TextView dateA;
        TextView prefix;
        ImageView imagemore;

        public AlicuotadorAdapterVH(@NonNull @NotNull View itemView) {
            super(itemView);

            dateA = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
