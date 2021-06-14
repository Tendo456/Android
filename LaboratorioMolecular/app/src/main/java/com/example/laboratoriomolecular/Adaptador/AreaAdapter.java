package com.example.laboratoriomolecular.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Modelos.AreaResponse;
import com.example.laboratoriomolecular.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AreaAdapter extends RecyclerView.Adapter<AreaAdapter.AreaAdapterVH> {

    private List<AreaResponse> areaResponseList;
    private Context contextAr;
    private AreaAdapter.ClickedItemAr clickedItemAr;

    public AreaAdapter(AreaAdapter.ClickedItemAr clickedItemAr){this.clickedItemAr=clickedItemAr;}

    public void setData(List<AreaResponse> areaResponseList){
        this.areaResponseList = areaResponseList;
        notifyDataSetChanged();
    }


    @NonNull
    @NotNull
    @Override
    public AreaAdapterVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        contextAr = parent.getContext();
        return new AreaAdapter.AreaAdapterVH(LayoutInflater.from(contextAr).inflate(R.layout.row_users, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AreaAdapterVH holder, int position) {
        AreaResponse areaResponse = areaResponseList.get(position);

        String date = areaResponse.getN_placa();
        String prefix = areaResponse.getId_area_limpia();

        holder.prefix.setText(prefix);
        holder.dateAr.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemAr.ClickedArea(areaResponse));
    }

    public interface ClickedItemAr{
        void ClickedArea(AreaResponse areaResponse);
    }

    @Override
    public int getItemCount() {    return areaResponseList.size(); }

    public class AreaAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAr;
        TextView prefix;
        ImageView imagemore;

        public AreaAdapterVH(@NotNull View itemView) {
            super(itemView);

            dateAr = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
