package com.example.quest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.novoda.merlin.Bindable;
import com.novoda.merlin.Connectable;
import com.novoda.merlin.Disconnectable;
import com.novoda.merlin.Merlin;
import com.novoda.merlin.NetworkStatus;

public class carga extends AppCompatActivity implements Connectable, Disconnectable, Bindable {

    private Merlin merlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga);

        merlin = new Merlin.Builder().withConnectableCallbacks()
                .withDisconnectableCallbacks()
                .withBindableCallbacks()
                .build(this);

        merlin.registerBindable(this);
        merlin.registerConnectable(this);
        merlin.registerDisconnectable(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(merlin != null){
            merlin.bind();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(merlin != null){
            merlin.unbind();
        }
    }

    @Override
    public void onBind(NetworkStatus networkStatus) {
        if(!networkStatus.isAvailable()){
            onDisconnect();
        }
    }

    @Override
    public void onConnect() {
        Toast toast = Toast.makeText(this,"En Linea",Toast.LENGTH_SHORT);
        View view = toast.getView();
        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.WHITE);
        view.getBackground().setColorFilter(Color.parseColor("#669933"), PorterDuff.Mode.SRC_IN);
        toast.show();
    }

    @Override
    public void onDisconnect() {
        runOnUiThread(() -> {
            Toast.makeText(this,"Fuera de Linea",Toast.LENGTH_SHORT).show();
        });

    }
}