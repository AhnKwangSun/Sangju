package com.example.laser.sangju.SubPage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;

/**
 * Created by Laser on 2017-11-08.
 */

public class SubA_9 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1,a2,a3,a4;
    Spinner spinner;
    private float baseWidth = 1080;
    private float baseHeight = 672;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a9);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a9_i1_img);
        a2 = (ImageView) findViewById(R.id.sub_a9_i2_img);
        a3 = (ImageView) findViewById(R.id.sub_a9_i3_img);
        a4 = (ImageView) findViewById(R.id.sub_a9_i4_img);
        spinner = (Spinner) findViewById(R.id.spinner);


        a1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();
                float startBaseX = 940  * view.getWidth() / baseWidth;
                float endBaseX = 1040 * view.getWidth() / baseWidth;
                Log.e("Location:", "x = " + EventX + " y=" + EventY);

                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(40,viewHeight,1) && EventY <= calcXYLocation(100,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://horse-riding.sangju.go.kr/"));
                            startActivity(intent);
                        }
                    }
                }
                return false;
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_9.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        a1.setVisibility(View.VISIBLE);
                        a2.setVisibility(View.GONE);
                        a3.setVisibility(View.GONE);
                        a4.setVisibility(View.GONE);
                        break;
                    case 1:
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.VISIBLE);
                        a3.setVisibility(View.GONE);
                        a4.setVisibility(View.GONE);
                        break;
                    case 2:
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.GONE);
                        a3.setVisibility(View.VISIBLE);
                        a4.setVisibility(View.GONE);
                        break;
                    case 3:
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.GONE);
                        a3.setVisibility(View.GONE);
                        a4.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private int calcXYLocation(int val, float Height, int select)
    {
        return (int)(val * Height / baseHeight);
    }
}
