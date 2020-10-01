package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RadioGroup cd;
    RadioButton d;
    Button b;
    int w=1;
    ImageView di1;
    ImageView di2;
    Random r1 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cd=findViewById(R.id.rg);
        d.findViewById(R.id.radioButton);
        b.findViewById(R.id.bottom);
        di1.findViewById(R.id.di1);
        di2.findViewById(R.id.di2);

        cd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) w=1;
                else if (checkedId == R.id.radioButton2) w=2;
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dn1, dn2;

                if (w==1) {
                    dn1=r1.nextInt(6)+1;
                    di2.setVisibility(View.INVISIBLE);
                    switch (dn1) {
                        case 1:
                            di1.setImageResource(R.drawable.d1);
                            break;
                        case 2:
                            di1.setImageResource(R.drawable.d2);
                            break;
                        case 3:
                            di1.setImageResource(R.drawable.d3);
                            break;
                        case 4:
                            di1.setImageResource(R.drawable.d4);
                            break;
                        case 5:
                            di1.setImageResource(R.drawable.d5);
                            break;
                        case 6:
                            di1.setImageResource(R.drawable.d6);
                            break;
                    }
                }
                else if (w==2) {
                    dn1=r1.nextInt(6)+1;
                    dn2=r1.nextInt(6)+1;
                    di2.setVisibility(View.VISIBLE);
                    switch (dn1) {
                        case 1:
                            di1.setImageResource(R.drawable.d1);
                            break;
                        case 2:
                            di1.setImageResource(R.drawable.d2);
                            break;
                        case 3:
                            di1.setImageResource(R.drawable.d3);
                            break;
                        case 4:
                            di1.setImageResource(R.drawable.d4);
                            break;
                        case 5:
                            di1.setImageResource(R.drawable.d5);
                            break;
                        case 6:
                            di1.setImageResource(R.drawable.d6);
                            break;
                    }
                    switch (dn2) {
                        case 1:
                            di2.setImageResource(R.drawable.d1);
                            break;
                        case 2:
                            di2.setImageResource(R.drawable.d2);
                            break;
                        case 3:
                            di2.setImageResource(R.drawable.d3);
                            break;
                        case 4:
                            di2.setImageResource(R.drawable.d4);
                            break;
                        case 5:
                            di2.setImageResource(R.drawable.d5);
                            break;
                        case 6:
                            di2.setImageResource(R.drawable.d6);
                            break;
                    }
                }
            }
        });
    }
}