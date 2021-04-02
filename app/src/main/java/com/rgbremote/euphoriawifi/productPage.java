package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);
    }

    public void lite(View v) {
        Intent intent = new Intent(productPage.this, Setup.class);
        startActivity(intent);
    }
}