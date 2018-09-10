package com.example.laser.sangju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.laser.sangju.MainPage.*;

public class MainActivity extends AppCompatActivity {

    Button main_A, main_B, main_C, main_D;
    ImageView homeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_A = (Button) findViewById(R.id.main_A);
        main_B = (Button) findViewById(R.id.main_B);
        main_C = (Button) findViewById(R.id.main_C);
        main_D = (Button) findViewById(R.id.main_D);
        homeButton = (ImageView) findViewById(R.id.img_home);

        main_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainA.class);
                startActivity(i);
            }
        });

        main_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainB.class);
                startActivity(i);
            }
        });

        main_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainC.class);
                startActivity(i);
            }
        });

        main_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainD.class);
                startActivity(i);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
