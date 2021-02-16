package com.example.temperaturas.Modelos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.temperaturas.R;

import java.util.List;


public class AtencionesAdapter extends RecyclerView.Adapter<AtencionesAdapter.AtencionAdapterVH> {

    private List<AtencionesResponse> atencionesResponseList;
    private Context context;
    private ClickedItem clickedItem;

    public AtencionesAdapter(ClickedItem clickedItem){this.clickedItem = clickedItem;}

    public void setData(List<AtencionesResponse> atencionesResponses){
        this.atencionesResponseList = atencionesResponses;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AtencionesAdapter.AtencionAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new AtencionesAdapter.AtencionAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_atenciones,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AtencionesAdapter.AtencionAdapterVH holder, int position) {
        AtencionesResponse atencionesResponse = atencionesResponseList.get(position);

        int username = atencionesResponse.getIdpatient();
        int prefix = atencionesResponse.getIdatention();

        holder.username.setText(String.valueOf(username));
        holder.prefix.setText(String.valueOf(username));
        holder.imageMore.setOnClickListener(v -> clickedItem.ClickedAtencion(atencionesResponse));

    }

    public interface ClickedItem{
        public void ClickedAtencion(AtencionesResponse atencionesResponse);
    }

    @Override
    public int getItemCount() { return atencionesResponseList.size(); }

    public class AtencionAdapterVH extends RecyclerView.ViewHolder{

        TextView username;
        TextView prefix;
        ImageView imageMore;


        public AtencionAdapterVH(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.username);
            prefix = itemView.findViewById(R.id.prefix);
            imageMore = itemView.findViewById(R.id.imageMore);
        }
    }
}
