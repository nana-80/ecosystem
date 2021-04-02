package com.rgbremote.euphoriawifi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Setup extends AppCompatActivity implements View.OnClickListener{
    CheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
    View buttonscan;
    ImageView grnchk1, grnchk2, grnchk3, grnchk4, grnchk5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        grnchk1=findViewById(R.id.grnchk1);
        grnchk2=findViewById(R.id.grnchk2);
        grnchk3=findViewById(R.id.grnchk3);
        grnchk4=findViewById(R.id.grnchk4);
        grnchk5=findViewById(R.id.grnchk5);

        checkbox1=findViewById(R.id.checkBox);
        checkbox2=findViewById(R.id.checkBox2);
        checkbox3=findViewById(R.id.checkBox3);
        checkbox4=findViewById(R.id.checkBox4);
        checkbox5=findViewById(R.id.checkBox5);
        buttonscan=findViewById(R.id.buttonscan);

        buttonscan.setVisibility(View.GONE);
        grnchk1.setVisibility(View.GONE);
        grnchk2.setVisibility(View.GONE);
        grnchk3.setVisibility(View.GONE);
        grnchk4.setVisibility(View.GONE);
        grnchk5.setVisibility(View.GONE);

        checkbox1.setOnClickListener(this);
        checkbox2.setOnClickListener(this);
        checkbox3.setOnClickListener(this);
        checkbox4.setOnClickListener(this);
        checkbox5.setOnClickListener(this);



    }



    @SuppressLint("ResourceType")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.checkBox:
                if (checkbox1.isChecked()) {
                  buttonscan.setVisibility(View.VISIBLE);
                    checkbox1.setVisibility(View.GONE);
                    grnchk1.setVisibility(View.VISIBLE);
                  break;
                }

            case R.id.checkBox2:
                if (checkbox2.isChecked()) {
                    buttonscan.setVisibility(View.VISIBLE);
                    checkbox2.setVisibility(View.GONE);
                    grnchk2.setVisibility(View.VISIBLE);
                    break;
                }
            case R.id.checkBox3:
                if (checkbox3.isChecked()) {
                    buttonscan.setVisibility(View.VISIBLE);
                    checkbox3.setVisibility(View.GONE);
                    grnchk3.setVisibility(View.VISIBLE);
                    break;
                }
            case R.id.checkBox4:
                if (checkbox4.isChecked()) {
                    buttonscan.setVisibility(View.VISIBLE);
                    checkbox4.setVisibility(View.GONE);
                    grnchk4.setVisibility(View.VISIBLE);
                    break;
                }
            case R.id.checkBox5:
                if (checkbox5.isChecked()) {
                    buttonscan.setVisibility(View.VISIBLE);
                    checkbox5.setVisibility(View.GONE);
                    grnchk5.setVisibility(View.VISIBLE);
                    break;
                }
        }
    }

    public void setup(View v) {
        Intent intent = new Intent(Setup.this, captured.class);
        startActivity(intent);
    }
}