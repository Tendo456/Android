package com.example.poke;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserAdapterVH>{

    private List<PokemonByIdResponse> pokemonByIdResponseList;
    private Context context;
    private ClickedItem clickedItem;

    public UsersAdapter(ClickedItem clickedItem) {this.clickedItem = clickedItem;}

    public void setData(List<PokemonByIdResponse> pokemonByIdResponsesList){
        this.pokemonByIdResponseList = pokemonByIdResponsesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UsersAdapter.UserAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        context = parent.getContext();
        return new UsersAdapter.UserAdapterVH(LayoutInflater.from(context).inflate(R.layout.row_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.UserAdapterVH holder, int position) {

        PokemonByIdResponse pokemonByIdResponse = pokemonByIdResponseList.get(position);

        String username = pokemonByIdResponse.getName();
        String prefix;
        prefix = "A";

        holder.prefix.setText(prefix);
        holder.name.setText(username);
        holder.imageMore.setOnClickListener(v -> clickedItem.ClickedUser(pokemonByIdResponse));

    }

    public interface ClickedItem{
        public void ClickedUser(PokemonByIdResponse pokemonByIdResponse);
    }

    @Override
    public int getItemCount() { return pokemonByIdResponseList.size(); }

    public class UserAdapterVH extends RecyclerView.ViewHolder {
        TextView name;
        TextView prefix;
        ImageView imageMore;

        public UserAdapterVH(@NonNull View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.username);
            prefix = itemView.findViewById(R.id.prefix);
            imageMore = itemView.findViewById(R.id.imageMore);
        }
    }
}
