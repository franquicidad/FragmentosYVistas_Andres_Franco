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

public class InsViento extends Fragment {

    ImageButton favTuba,playTuba,favSax,playSax;



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.viento,container,false);

        favTuba=(ImageButton)view.findViewById(R.id.favTuba);
        playTuba=(ImageButton)view.findViewById(R.id.playTuba);
        favSax=(ImageButton)view.findViewById(R.id.favsaxofon);
        playSax=(ImageButton)view.findViewById(R.id.playSaxofon);

        favTuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Tuba como Favorita",Toast.LENGTH_LONG).show();

            }
        });
        playTuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"tuba play",Toast.LENGTH_LONG).show();

            }
        });
        favSax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Saxofon como Favorita",Toast.LENGTH_LONG).show();

            }
        });
        playSax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"toacando saxofon",Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
}
