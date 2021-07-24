package com.example.laboratorio.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorio.Modelos.AmplificacionResponse;
import com.example.laboratorio.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AmplificacionAdapter extends RecyclerView.Adapter<AmplificacionAdapter.AmplificacionAdapterVH> {

    private List<AmplificacionResponse> amplificacionResponseList;
    private Context contextAm;
    private AmplificacionAdapter.ClickedItemAm clickedItemAm;

    public AmplificacionAdapter(ClickedItemAm clickedItemAm){this.clickedItemAm=clickedItemAm;}

    public void setData(List<AmplificacionResponse> amplificacionResponseList){
        this.amplificacionResponseList = amplificacionResponseList;
        notifyDataSetChanged();

    }

    @NonNull
    @NotNull
    @Override
    public AmplificacionAdapterVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        contextAm = parent.getContext();
        return new AmplificacionAdapter.AmplificacionAdapterVH(LayoutInflater.from(contextAm).inflate(R.layout.row_users, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AmplificacionAdapterVH holder, int position) {
        AmplificacionResponse amplificacionResponse = amplificacionResponseList.get(position);

        String date = amplificacionResponse.getN_placa();
        String prefix = amplificacionResponse.getId_amplificacion();

        holder.prefix.setText(prefix);
        holder.dateAm.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemAm.ClickedAmplificacion(amplificacionResponse));
    }

    public interface ClickedItemAm { void ClickedAmplificacion (AmplificacionResponse amplificacionResponse);
    }

    @Override
    public int getItemCount() {
        return amplificacionResponseList.size();
    }

    public static class AmplificacionAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAm;
        TextView prefix;
        ImageView imagemore;

        public AmplificacionAdapterVH(@NonNull @NotNull View itemView) {
            super(itemView);

            dateAm = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}


