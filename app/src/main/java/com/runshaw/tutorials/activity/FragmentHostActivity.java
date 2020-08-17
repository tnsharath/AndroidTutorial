package com.runshaw.tutorials.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.runshaw.tutorials.R;
import com.runshaw.tutorials.fragment.Fragment1;
import com.runshaw.tutorials.fragment.Fragment2;

public class FragmentHostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_host);

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment1 fragment1  = new Fragment1();
        fragmentTransaction.add(R.id.frameLayout, fragment1);
        fragmentTransaction.commit();
    }

    public void fragment1(View view) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment1 fragment1  = new Fragment1();
        fragmentTransaction.replace(R.id.frameLayout, fragment1);
        fragmentTransaction.commit();
    }

    public void fragment2(View view) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment2 fragment2  = new Fragment2();
        fragmentTransaction.replace(R.id.frameLayout, fragment2);
        fragmentTransaction.commit();
    }
}