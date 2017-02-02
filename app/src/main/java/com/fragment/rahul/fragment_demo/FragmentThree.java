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

public class FragmentThree extends Fragment {

    Button b3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v1=inflater.inflate(R.layout.fragment_three,container,false);
        b3=(Button) v1.findViewById(R.id.bt3);
        b3.setOnClickListener(new View.OnClickListener() {
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
        return v1;
    }
}
