package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Scan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
    }

    public void scan(View v) {
        Intent intent = new Intent(Scan.this, captured.class);
        startActivity(intent);
    }
}