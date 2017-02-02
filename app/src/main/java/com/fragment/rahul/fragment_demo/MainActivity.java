package com.fragment.rahul.fragment_demo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btt1,btt2,btt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btt1=(Button)findViewById(R.id.bt1);
        btt2=(Button)findViewById(R.id.bt2);
        btt3=(Button)findViewById(R.id.bt3);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne loginFragment = new FragmentOne();
        fragmentTransaction.add(R.id.activity_main,loginFragment);
        fragmentTransaction.commit();





    }
}
