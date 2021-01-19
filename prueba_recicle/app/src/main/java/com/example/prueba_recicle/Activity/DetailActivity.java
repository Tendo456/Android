package com.example.prueba_recicle.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prueba_recicle.R;
import com.example.prueba_recicle.model.ItemList;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgItemDetail;
    private TextView tvNombreDetail;
    private TextView tvIdDetail;
    private ItemList itemDetail;

    //private String doamin_image = "http://10.50.1.180/Api%20prueba/img/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(getClass().getSimpleName());

        initViews();
        initValues();
    }

    private void initViews() {
        imgItemDetail = findViewById(R.id.imgItemDetail);
        tvNombreDetail = findViewById(R.id.tvNombreDetail);
        tvIdDetail = findViewById(R.id.tvIdDetail);
    }

    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras().getSerializable("itemDetail");



        //Picasso.get().load(doamin_image+item.getPoster()).into(holder.imgItem);
        //imgItemDetail.setImageResource(itemDetail.getImgResource());
        tvNombreDetail.setText(itemDetail.getNombre());
        tvIdDetail.setText(itemDetail.getId());

    }
}