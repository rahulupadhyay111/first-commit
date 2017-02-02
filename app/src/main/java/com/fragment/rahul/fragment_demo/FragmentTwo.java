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

public class FragmentTwo extends Fragment {
    Button b2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_two,container,false);
        b2=(Button) v.findViewById(R.id.bt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                FragmentThree f3=new FragmentThree();
                ft.replace(R.id.activity_main,f3);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        return v;
    }
}
