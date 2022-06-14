package com.example.laboratoriomolecular.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratoriomolecular.Modelos.ResultadosResponse;
import com.example.laboratoriomolecular.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ResultadosAdapter extends RecyclerView.Adapter<ResultadosAdapter.ResultadosAdapterVH> {

    private List<ResultadosResponse> resultadosResponseList;
    private Context contextRes;
    private ResultadosAdapter.ClickedItemRes clickedItemRes;

    public ResultadosAdapter(ResultadosAdapter.ClickedItemRes clickedItemRes){this.clickedItemRes=clickedItemRes;}

    public void setData(List<ResultadosResponse> resultadosResponseList){
        this.resultadosResponseList = resultadosResponseList;
        notifyDataSetChanged();
    }

    @NonNull
    @NotNull
    @Override
    public ResultadosAdapterVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        contextRes = parent.getContext();
        return new ResultadosAdapter.ResultadosAdapterVH(LayoutInflater.from(contextRes).inflate(R.layout.row_users, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ResultadosAdapterVH holder, int position) {
        ResultadosResponse resultadosResponse = resultadosResponseList.get(position);

        String date = resultadosResponse.getF_inicio();
        String prefix = resultadosResponse.getId_resultados();

        holder.prefix.setText(prefix);
        holder.dateRes.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemRes.ClickedResultados(resultadosResponse));
    }

    public interface ClickedItemRes{
        void ClickedResultados(ResultadosResponse resultadosResponse);
    }

    @Override
    public int getItemCount() { return resultadosResponseList.size();   }

    public class ResultadosAdapterVH extends RecyclerView.ViewHolder {

        TextView dateRes;
        TextView prefix;
        ImageView imagemore;

        public ResultadosAdapterVH(@NonNull @NotNull View itemView) {
            super(itemView);

            dateRes = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
