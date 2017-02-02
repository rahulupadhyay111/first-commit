package com.fragment.rahul.fragment_demo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by rahul on 2/1/2017.
 */

public class FragmentOne extends Fragment {

    Button b1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmrnt_one,container,false);
        b1=(Button) view.findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                FragmentTwo f2=new FragmentTwo();
                ft.replace(R.id.activity_main,f2);
                ft.addToBackStack("");
                ft.commit();
            }
        });



        return view;
    }
}
