package com.example.screeningapp.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screeningapp.Modelos.StockResponse;
import com.example.screeningapp.R;

import java.util.List;

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.StockAdapterVH> {

    private List<StockResponse> stockResponseList;
    private Context contextS;
    private ClickedItemS clickedItemS;

    public StockAdapter(ClickedItemS clickedItemS) {
        this.clickedItemS = clickedItemS;
    }

    public void setData(List<StockResponse> stockResponseList){
        this.stockResponseList = stockResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public StockAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextS = parent.getContext();
        return new StockAdapterVH(LayoutInflater.from(contextS).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StockAdapterVH holder, int position) {
        StockResponse stockResponse = stockResponseList.get(position);

        String date = stockResponse.getMarca();
        String prefix = stockResponse.getId_stock();

        holder.prefix.setText(prefix);
        holder.dateAm.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemS.ClickedStock(stockResponse));
    }

    public interface ClickedItemS {
        void ClickedStock(StockResponse stockResponse);
    }

    @Override
    public int getItemCount() {
        return stockResponseList.size();
    }

    public class StockAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAm;
        TextView prefix;
        ImageView imagemore;

        public StockAdapterVH(@NonNull View itemView) {
            super(itemView);

            dateAm = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
