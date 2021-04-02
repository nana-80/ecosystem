package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wake_up1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up1);
    }

    public void wakeup1 (View v) {
        Intent intent = new Intent(wake_up1.this, wake_up2.class);
        startActivity(intent);
    }
}