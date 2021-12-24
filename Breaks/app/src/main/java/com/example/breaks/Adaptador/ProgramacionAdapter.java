package com.example.breaks.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breaks.Modelos.ProgramacionResponse;
import com.example.breaks.R;

import java.util.List;

public class ProgramacionAdapter extends RecyclerView.Adapter<ProgramacionAdapter.ProgramacionAdapterVH> {

    private List<ProgramacionResponse> programacionResponseList;
    private Context contextP;
    private ClickedItemP clickedItemP;

    public ProgramacionAdapter(ClickedItemP clickedItemP) {
        this.clickedItemP = clickedItemP;
    }

    public void setData(List<ProgramacionResponse> programacionResponseList){
        this.programacionResponseList = programacionResponseList;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public ProgramacionAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        contextP = parent.getContext();
        return new ProgramacionAdapter.ProgramacionAdapterVH(LayoutInflater.from(contextP).inflate(R.layout.row_users,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ProgramacionAdapter.ProgramacionAdapterVH holder, int position) {

        ProgramacionResponse programacionResponse = programacionResponseList.get(position);

        String date = programacionResponse.getMarca();
        String prefix = programacionResponse.getId_programacion();

        holder.prefix.setText(prefix);
        holder.dateAm.setText(date);
        holder.imagemore.setOnClickListener(v -> clickedItemP.ClickedProg(programacionResponse));

    }

    public interface ClickedItemP{
        void ClickedProg(ProgramacionResponse programacionResponse);
    }


    @Override
    public int getItemCount() {
        return programacionResponseList.size();
    }

    public class ProgramacionAdapterVH extends RecyclerView.ViewHolder {

        TextView dateAm;
        TextView prefix;
        ImageView imagemore;

        public ProgramacionAdapterVH(@NonNull View itemView) {
            super(itemView);

            dateAm = itemView.findViewById(R.id.date);
            prefix = itemView.findViewById(R.id.prefix);
            imagemore = itemView.findViewById(R.id.imageMore);
        }
    }
}
