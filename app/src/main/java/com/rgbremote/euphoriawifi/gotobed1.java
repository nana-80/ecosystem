package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gotobed1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gotobed1);
    }

    public void gotobed1 (View view) {
        Intent intent = new Intent (gotobed1.this, gotobed2.class);
        startActivity(intent);
    }
}