package com.example.mac.fragmentosyvistas_andres_franco;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by mac on 5/10/17.
 */

public class ListaTiposFragment extends ListFragment {


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        BaseTipos datos=new BaseTipos();

        ListAdapter listaInstrumentos=new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,datos.tiposInstrumento);
        setListAdapter(listaInstrumentos);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        InsCuerda cuerda=new InsCuerda();
        InsElectricos electricos=new InsElectricos();
        InsPercusion insPercusion=new InsPercusion();
        InsViento insViento=new InsViento();


        FragmentTransaction cambioFragmentos=getActivity().getSupportFragmentManager().beginTransaction();

        switch (position){
            case 0:
                cambioFragmentos.replace(R.id.fragment,cuerda);
                cambioFragmentos.addToBackStack(null);
                cambioFragmentos.commit();
                break;
            case 1:
                cambioFragmentos.replace(R.id.fragment,insPercusion);
                cambioFragmentos.addToBackStack(null);
                cambioFragmentos.commit();
                break;
            case 2:
                cambioFragmentos.replace(R.id.fragment,insViento);
                cambioFragmentos.addToBackStack(null);
                cambioFragmentos.commit();
                break;
            case 3:
                cambioFragmentos.replace(R.id.fragment,electricos);
                cambioFragmentos.addToBackStack(null);
                cambioFragmentos.commit();
                break;
                default:
                    break;

        }

    }
}
