package com.dotplays.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dotplays.myapplication.fragment.OneFragment;
import com.dotplays.myapplication.fragment.TwoFragment;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final OneFragment oneFragment = new OneFragment();
        final TwoFragment twoFragment = new TwoFragment();

        findViewById(R.id.btnOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, oneFragment).commit();
            }
        });


        findViewById(R.id.btnTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, twoFragment).commit();
            }
        });
    }
}
