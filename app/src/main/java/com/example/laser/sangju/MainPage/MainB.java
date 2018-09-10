package com.example.laser.sangju.MainPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;
import com.example.laser.sangju.SubPage.SubB_1;
import com.example.laser.sangju.SubPage.SubB_2;
import com.example.laser.sangju.SubPage.SubB_3;
import com.example.laser.sangju.SubPage.SubB_4;
import com.example.laser.sangju.SubPage.SubB_5;

/**
 * Created by Laser on 2017-11-07.
 */

public class MainB extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5;
    ImageView homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainb);

        homeButton = (ImageView) findViewById(R.id.img_home);
        onClickListenerSetting();

    }

    public void onClickListenerSetting() {
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        homeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b1:
                Intent b1 = new Intent(MainB.this, SubB_1.class);
                startActivity(b1);
                break;
            case R.id.b2:
                Intent b2 = new Intent(MainB.this, SubB_2.class);
                startActivity(b2);
                break;
            case R.id.b3:
                Intent b3 = new Intent(MainB.this, SubB_3.class);
                startActivity(b3);
                break;
            case R.id.b4:
                Intent b4 = new Intent(MainB.this, SubB_4.class);
                startActivity(b4);
                break;
            case R.id.b5:
                Intent b5 = new Intent(MainB.this, SubB_5.class);
                startActivity(b5);
                break;
            case R.id.img_home:
                Intent home = new Intent(MainB.this, MainActivity.class);
                home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);
                break;
        }
    }
}
