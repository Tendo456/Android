package com.example.laboratorio.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorio.Modelos.PlacaResponse;
import com.example.laboratorio.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PlacaAdapter extends RecyclerView.Adapter<PlacaAdapter.PlacaAdapterVH> {

    private List<PlacaResponse> placaResponseList;
    private Context context;
    private ClickedItemP clickedItemP;

    public PlacaAdapter(ClickedItemP clickedItemP) {this.clickedItemP = clickedItemP;}

    public void setData(List<PlacaResponse> placaResponseList) {
        this.placaResponseList = placaResponseList;
        notifyDataSetChanged();
    }

    @NotNull
    @Override
    public PlacaAdapterVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new PlacaAdapter.PlacaAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PlacaAdapterVH holder, int position) {

        PlacaResponse placaResponse = placaResponseList.get(position);

        String date = placaResponse.getN_placa();
        String prefix = placaResponse.getId_placa();

        holder.prefix.setText(prefix);
        holder.date.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemP.ClickedNueva_placa(placaResponse));

    }



    @Override
    public int getItemCount() {
        return placaResponseList.size();
    }

    public interface ClickedItemP {
        void ClickedNueva_placa(PlacaResponse placaResponse);
    }

    public class PlacaAdapterVH extends RecyclerView.ViewHolder {

        TextView date;
        TextView prefix;
        ImageView imagemore;

        public PlacaAdapterVH(@NonNull @NotNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
