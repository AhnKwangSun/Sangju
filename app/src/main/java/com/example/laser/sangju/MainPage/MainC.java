package com.example.laser.sangju.MainPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;
import com.example.laser.sangju.SubPage.SubC_1;
import com.example.laser.sangju.SubPage.SubC_2;
import com.example.laser.sangju.SubPage.SubC_3;
import com.example.laser.sangju.SubPage.SubC_4;
import com.example.laser.sangju.SubPage.SubC_5;
import com.example.laser.sangju.SubPage.SubC_6;

/**
 * Created by Laser on 2017-11-07.
 */

public class MainC extends AppCompatActivity implements View.OnClickListener  {

    Button c1,c2,c3,c4,c5,c6;
    ImageView homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainc);

        homeButton = (ImageView) findViewById(R.id.img_home);
        onClickListenerSetting();

    }

    public void onClickListenerSetting() {
        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);
        c4 = (Button) findViewById(R.id.c4);
        c5 = (Button) findViewById(R.id.c5);
        c6 = (Button) findViewById(R.id.c6);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        homeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.c1:
                Intent c1 = new Intent(MainC.this, SubC_1.class);
                startActivity(c1);
                break;
            case R.id.c2:
                Intent c2 = new Intent(MainC.this, SubC_2.class);
                startActivity(c2);
                break;
            case R.id.c3:
                Intent c3 = new Intent(MainC.this, SubC_3.class);
                startActivity(c3);
                break;
            case R.id.c4:
                Intent c4 = new Intent(MainC.this, SubC_4.class);
                startActivity(c4);
                break;
            case R.id.c5:
                Intent c5 = new Intent(MainC.this, SubC_5.class);
                startActivity(c5);
                break;
            case R.id.c6:
                Intent c6 = new Intent(MainC.this, SubC_6.class);
                startActivity(c6);
                break;
            case R.id.img_home:
                Intent home = new Intent(MainC.this, MainActivity.class);
                home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);
                break;
        }
    }
}
