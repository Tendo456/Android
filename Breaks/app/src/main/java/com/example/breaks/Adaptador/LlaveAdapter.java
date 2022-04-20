package com.example.breaks.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Modelos.LlaveResponse;
import com.example.breaks.R;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LlaveAdapter extends RecyclerView.Adapter<LlaveAdapter.LlaveadpterVH> {

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
    public LlaveadpterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextLl = parent.getContext();
        return new LlaveAdapter.LlaveadpterVH(LayoutInflater.from(contextLl).inflate(R.layout.row_keys,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LlaveadpterVH holder, int position) {

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

    public class LlaveadpterVH extends RecyclerView.ViewHolder {

        TextView N;
        TextView prefix;
        ImageView imagemore;

        public LlaveadpterVH(@NonNull View itemView) {
            super(itemView);

            N = itemView.findViewById(R.id.N);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
