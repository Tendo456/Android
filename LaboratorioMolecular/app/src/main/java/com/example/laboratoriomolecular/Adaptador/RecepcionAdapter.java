package com.example.laboratoriomolecular.Adaptador;

import android.content.Context;
import android.os.Build;
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
import java.util.stream.Collectors;

public class RecepcionAdapter extends RecyclerView.Adapter<RecepcionAdapter.RecepcionAdapterVH> {

    private List<RecepcionResponse> recepcionResponseList;
    private Context context;
    private ClickedItem clickedItem;
    private List<RecepcionResponse> original;

    public RecepcionAdapter(ClickedItem clickedItem){this.clickedItem = clickedItem;}

    public void setData(List<RecepcionResponse> recepcionResponseList){
        this.recepcionResponseList = recepcionResponseList;
        notifyDataSetChanged();
        original.addAll(recepcionResponseList);
    }

    @NonNull
    @Override
    public RecepcionAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new RecepcionAdapter.RecepcionAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecepcionAdapterVH holder, int position) {

        RecepcionResponse recepcionResponse = recepcionResponseList.get(position);

        String date = recepcionResponse.getFecha();
        String prefix = recepcionResponse.getIdrecepcion();

        holder.prefix.setText(prefix);
        holder.date.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItem.ClickedRecepcion(recepcionResponse));

    }

    public interface ClickedItem{
        public void ClickedRecepcion(RecepcionResponse recepcionResponse);
    }

    @Override
    public int getItemCount() { return recepcionResponseList.size(); }

    public void filter(String stbuscador){
        if(stbuscador.length() == 0){
            recepcionResponseList.clear();
            recepcionResponseList.addAll(original);
        }else{
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                List<RecepcionResponse>collect = recepcionResponseList.stream()
                        .filter(i -> i.getFecha().toLowerCase().contains(stbuscador))
                        .collect(Collectors.toList());

                recepcionResponseList.clear();
                recepcionResponseList.addAll(collect);
            }
            else{
                for(RecepcionResponse i : original){
                    if (i.getFecha().toLowerCase().contains(stbuscador)){
                        recepcionResponseList.add(i);
                    }
                }
            }
        }

        notifyDataSetChanged();

    }

    public class RecepcionAdapterVH extends RecyclerView.ViewHolder {

        TextView date;
        TextView prefix;
        ImageView imagemore;

        public RecepcionAdapterVH(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
