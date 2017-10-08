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

public class InsPercusion extends Fragment {

    ImageButton favRedo,playRedo,favBateriaKit,playBateriaKit;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.percusion,container,false);
        favRedo=(ImageButton)view.findViewById(R.id.favRedoblante);
        playRedo=(ImageButton)view.findViewById(R.id.playRedoblante);
        favBateriaKit=(ImageButton)view.findViewById(R.id.favBateriaKit);
        playBateriaKit=(ImageButton)view.findViewById(R.id.playBateriaKit);

        favRedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Redoblante como Favorita",Toast.LENGTH_LONG).show();

            }
        });
        playRedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Redoblante play",Toast.LENGTH_LONG).show();

            }
        });
        favBateriaKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Bateria kit como Favorita",Toast.LENGTH_LONG).show();

            }
        });playBateriaKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Bateria kit play",Toast.LENGTH_LONG).show();

            }
        });

        return  view;


    }

}
