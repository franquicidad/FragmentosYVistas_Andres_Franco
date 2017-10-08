package com.example.mac.fragmentosyvistas_andres_franco;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by mac on 6/10/17.
 */

public class InsElectricos extends Fragment {

    ImageButton favBatElec,playBatElec, favGuiElec,playGuiElec;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.electricos,container,false);

        favBatElec=(ImageButton)view.findViewById(R.id.favBateriaKit);
        playBatElec=(ImageButton)view.findViewById(R.id.playBateriaElec);
        favGuiElec=(ImageButton)view.findViewById(R.id.favGuitarraElec);
        playGuiElec=(ImageButton)view.findViewById(R.id.playGuitarraElec);

        favGuiElec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Bateria electrica como Favorita",Toast.LENGTH_LONG).show();

            }
        });
        playBatElec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Bateria electrica play",Toast.LENGTH_LONG).show();

            }
        });
        favGuiElec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Guitarra electrica como Favorita",Toast.LENGTH_LONG).show();

            }
        });

        playGuiElec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Guitarra play",Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
}
