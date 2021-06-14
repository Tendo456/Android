package com.example.laboratoriomolecular.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Modelos.ExtraccionResponse;
import com.example.laboratoriomolecular.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ExtraccionAdapter extends RecyclerView.Adapter<ExtraccionAdapter.ExtraccionAdapterVH> {

    private List<ExtraccionResponse> extraccionResponseList;
    private Context contextEx;
    private ExtraccionAdapter. ClickedItemEx clickedItemEx;

    public ExtraccionAdapter(ClickedItemEx clickedItemEx){this.clickedItemEx=clickedItemEx;}

    public void setData(List<ExtraccionResponse> extraccionResponseList){
        this.extraccionResponseList = extraccionResponseList;
        notifyDataSetChanged();
    }

    @NotNull
    @Override
    public ExtraccionAdapterVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        contextEx=parent.getContext();
        return new ExtraccionAdapterVH(LayoutInflater.from(contextEx).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ExtraccionAdapter.ExtraccionAdapterVH holder, int position) {
        ExtraccionResponse extraccionResponse = extraccionResponseList.get(position);

        String date = extraccionResponse.getN_placa();
        String prefix = extraccionResponse.getId_extraccion();

        holder.prefix.setText(prefix);
        holder.dateEx.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemEx.ClickedExtraccion(extraccionResponse));
    }

    public interface ClickedItemEx{
        void ClickedExtraccion(ExtraccionResponse extraccionResponse);
    }

    @Override
    public int getItemCount() { return extraccionResponseList.size(); }

    public static class ExtraccionAdapterVH extends RecyclerView.ViewHolder {

        TextView dateEx;
        TextView prefix;
        ImageView imagemore;

        public ExtraccionAdapterVH(@NonNull @NotNull View itemView) {
            super(itemView);
            dateEx = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);

        }
    }
}
