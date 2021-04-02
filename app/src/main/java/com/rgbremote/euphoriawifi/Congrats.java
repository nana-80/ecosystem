package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Congrats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats);
    }


    public void congrats (View v) {
        Intent intent = new Intent(Congrats.this, bottomNavPage.class);
        startActivity(intent);
    }
}