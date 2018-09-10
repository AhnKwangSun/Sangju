package com.example.laser.sangju.MainPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;
import com.example.laser.sangju.SubPage.SubA_2;
import com.example.laser.sangju.SubPage.SubA_1;
import com.example.laser.sangju.SubPage.SubA_3;
import com.example.laser.sangju.SubPage.SubA_5;
import com.example.laser.sangju.SubPage.SubA_4;
import com.example.laser.sangju.SubPage.SubA_6;
import com.example.laser.sangju.SubPage.SubA_8;
import com.example.laser.sangju.SubPage.SubA_7;
import com.example.laser.sangju.SubPage.SubA_9;

/**
 * Created by Laser on 2017-11-07.
 */

public class MainA extends AppCompatActivity implements View.OnClickListener {

    Button a1,a2,a3,a4,a5,a6,a7,a8,a9;
    ImageView homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maina);

        homeButton = (ImageView) findViewById(R.id.img_home);
        onClickListenerSetting();

    }

    public void onClickListenerSetting() {
        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        a4 = (Button) findViewById(R.id.a4);
        a5 = (Button) findViewById(R.id.a5);
        a6 = (Button) findViewById(R.id.a6);
        a7 = (Button) findViewById(R.id.a7);
        a8 = (Button) findViewById(R.id.a8);
        a9 = (Button) findViewById(R.id.a9);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        a9.setOnClickListener(this);
        homeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.a1:
                Intent a1 = new Intent(MainA.this, SubA_1.class);
                startActivity(a1);
                break;
            case R.id.a2:
                Intent a2 = new Intent(MainA.this, SubA_2.class);
                startActivity(a2);
                break;
            case R.id.a3:
                Intent a3 = new Intent(MainA.this, SubA_3.class);
                startActivity(a3);
                break;
            case R.id.a4:
                Intent a4 = new Intent(MainA.this, SubA_4.class);
                startActivity(a4);
                break;
            case R.id.a5:
                Intent a5 = new Intent(MainA.this, SubA_5.class);
                startActivity(a5);
                break;
            case R.id.a6:
                Intent a6 = new Intent(MainA.this, SubA_6.class);
                startActivity(a6);
                break;
            case R.id.a7:
                Intent a7 = new Intent(MainA.this, SubA_7.class);
                startActivity(a7);
                break;
            case R.id.a8:
                Intent a8 = new Intent(MainA.this, SubA_8.class);
                startActivity(a8);
                break;
            case R.id.a9:
                Intent a9 = new Intent(MainA.this, SubA_9.class);
                startActivity(a9);
                break;
            case R.id.img_home:
                Intent home = new Intent(MainA.this, MainActivity.class);
                home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);
                break;
        }
    }
}
