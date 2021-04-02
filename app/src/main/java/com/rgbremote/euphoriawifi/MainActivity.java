package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {


ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       viewPager = findViewById(R.id.View_pager);

       IntroAdapter adapter =new IntroAdapter(getSupportFragmentManager());
       viewPager.setAdapter(adapter);



    }



}