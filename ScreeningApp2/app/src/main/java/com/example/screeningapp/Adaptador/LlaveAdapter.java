package com.example.screeningapp.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screeningapp.Modelos.LlaveResponse;
import com.example.screeningapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LlaveAdapter extends RecyclerView.Adapter<LlaveAdapter.LlaveAdapterVH> {

    private List<LlaveResponse> llaveResponseList;
    private Context contextLl;
    private ClickedItemLl clickedItemLl;
    ArrayList<LlaveResponse> buscarLl;

    public LlaveAdapter(ClickedItemLl clickedItemLl) {this.clickedItemLl = clickedItemLl;
    }

    public void setData(List<LlaveResponse> llaveResponseList){
        this.llaveResponseList = llaveResponseList;

        buscarLl = new ArrayList<>();
        buscarLl.addAll(llaveResponseList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LlaveAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextLl = parent.getContext();
        return new LlaveAdapterVH(LayoutInflater.from(contextLl).inflate(R.layout.row_keys,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LlaveAdapterVH holder, int position) {
        LlaveResponse llaveResponse = llaveResponseList.get(position);

        //String id_llave = personalResponse.getApelli_paterno();
        String numero = llaveResponse.getNumero();
        //String date = personalResponse.getNombres();
        String prefix = llaveResponse.getId_llave();

        holder.prefix.setText(prefix);
        holder.N.setText(numero);
        holder.imagemore.setOnClickListener(v -> clickedItemLl.ClickedLl(llaveResponse));
    }

    public void filterLl(String SearchLl){
        int longi = SearchLl.length();
        if(longi == 0){
            llaveResponseList.clear();
            llaveResponseList.addAll(buscarLl);
        }else{
            List<LlaveResponse> collection = llaveResponseList.stream()
                    .filter(i -> i.getNumero().toLowerCase().contains(SearchLl.toLowerCase()))
                    .collect(Collectors.toList());
            llaveResponseList.clear();
            llaveResponseList.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public interface ClickedItemLl{
        void ClickedLl(LlaveResponse llaveResponse);
    }

    @Override
    public int getItemCount() {
        return llaveResponseList.size();
    }

    public class LlaveAdapterVH extends RecyclerView.ViewHolder {

        TextView N;
        TextView prefix;
        ImageView imagemore;

        public LlaveAdapterVH(@NonNull View itemView) {
            super(itemView);

            N = itemView.findViewById(R.id.N);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
