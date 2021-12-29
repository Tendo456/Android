package com.example.breaks.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Modelos.BreaksResponse;
import com.example.breaks.R;

import java.util.List;

public class BreaksAdapter extends RecyclerView.Adapter<BreaksAdapter.BreaksAdapterVH> {

    private List<BreaksResponse> breaksResponseList;
    private Context contextB;
    //private ClickedItemB clickedItemB;

    public BreaksAdapter() {

    }

    public void setData(List<BreaksResponse> breaksResponseList){
        this.breaksResponseList = breaksResponseList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public BreaksAdapter.BreaksAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextB = parent.getContext();
        return new BreaksAdapter.BreaksAdapterVH(LayoutInflater.from(contextB).inflate(R.layout.row_users,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull BreaksAdapter.BreaksAdapterVH holder, int position) {
        BreaksResponse breaksResponse = breaksResponseList.get(position);

        String date = breaksResponse.getNombres();
        String prefix = breaksResponse.getId_breaks();

        holder.prefix.setText(prefix);
        holder.dateAm.setText(date);
        //holder.imagemore.setOnClickListener(v -> clickedItemM.ClickedMarca(marcasResponse));

    }

    @Override
    public int getItemCount() {
        return breaksResponseList.size();
    }

    public class BreaksAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAm;
        TextView prefix;
        ImageView imagemore;

        public BreaksAdapterVH(@NonNull View itemView) {
            super(itemView);

            dateAm = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
