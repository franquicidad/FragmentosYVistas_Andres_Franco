package com.example.mac.fragmentosyvistas_andres_franco;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by mac on 6/10/17.
 */

public class InsCuerda extends Fragment {

    ImageButton favGuitarra,favViolin,playGuitarra,playviolin;



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {



        View view=inflater.inflate(R.layout.activity_cuerda,container,false);

        favGuitarra=(ImageButton)view.findViewById(R.id.favoritoguitarra);
        favViolin=(ImageButton)view.findViewById(R.id.violinfavorito);
        playGuitarra=(ImageButton)view.findViewById(R.id.playguitarra);
        playviolin=(ImageButton)view.findViewById(R.id.playviolin);

        favGuitarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"guitarra a favorito",Toast.LENGTH_LONG).show();
            }
        });
        favViolin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"favorito violin",Toast.LENGTH_LONG).show();

            }
        });
        playGuitarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"guitarra play",Toast.LENGTH_LONG).show();

            }
        });
        playviolin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"violin play",Toast.LENGTH_LONG).show();

            }
        });


        return view;


    }
}
