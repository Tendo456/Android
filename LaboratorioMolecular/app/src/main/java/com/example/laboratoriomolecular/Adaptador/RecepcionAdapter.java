package com.example.laboratoriomolecular.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Modelos.RecepcionResponse;
import com.example.laboratoriomolecular.R;

import java.util.List;

public class RecepcionAdapter extends RecyclerView.Adapter<RecepcionAdapter.RecepcionAdapterVH> {

    private List<RecepcionResponse> recepcionResponseList;
    private Context context;
    private ClickedItem clickedItem;

    public RecepcionAdapter(ClickedItem clickedItem){this.clickedItem = clickedItem;}

    public void setData(List<RecepcionResponse> recepcionResponseList){
        this.recepcionResponseList = recepcionResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecepcionAdapterVH onCreateViewHolder( @NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new RecepcionAdapter.RecepcionAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecepcionAdapterVH holder, int position) {

        RecepcionResponse recepcionResponse = recepcionResponseList.get(position);

        String date = recepcionResponse.getFecha();
        String prefix = recepcionResponse.getId_recepcion();

        holder.prefix.setText(prefix);
        holder.dateR.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItem.ClickedRecepcion(recepcionResponse));

    }

    public interface ClickedItem{
        void ClickedRecepcion(RecepcionResponse recepcionResponse);
    }

    @Override
    public int getItemCount() { return recepcionResponseList.size(); }

    public class RecepcionAdapterVH extends RecyclerView.ViewHolder {

        TextView dateR;
        TextView prefix;
        ImageView imagemore;

        public RecepcionAdapterVH(@NonNull View itemView) {
            super(itemView);

            dateR = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
