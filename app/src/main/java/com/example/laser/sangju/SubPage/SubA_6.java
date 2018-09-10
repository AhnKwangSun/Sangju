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
import android.widget.ImageView;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;

/**
 * Created by Laser on 2017-11-08.
 */

public class SubA_6 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1, a2;
    private float baseWidth = 1080;
    private float baseHeight = 1189;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a6);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a6_i1_img);
        a2 = (ImageView) findViewById(R.id.sub_a6_i2_img);

        a1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();

                float startBaseX1 = 850  * view.getWidth() / baseWidth;
                float endBaseX1 = 930 * view.getWidth() / baseWidth;
                float startBaseX2 = 960  * view.getWidth() / baseWidth;
                float endBaseX2 = 1040 * view.getWidth() / baseWidth;

                Log.e("Location:", "x = " + EventX + " y=" + EventY);

                if (EventX >= startBaseX1  && EventX <= endBaseX1) {
                    if (EventY >= calcXYLocation(50, viewHeight, 1) && EventY <= calcXYLocation(145, viewHeight, 1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sports.knu.ac.kr/\n"));
                            startActivity(intent);
                        }
                    }
                } else if(EventX >= startBaseX2  && EventX <= endBaseX2) {
                    if (EventY >= calcXYLocation(50, viewHeight, 1) && EventY <= calcXYLocation(145, viewHeight, 1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("경북대학교", "054-530-1728");
                        }
                    }
                }
                return false;
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_6.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

    }
    private void Dialog_Default(String name, final String number) {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("전화걸기");
        _alert.setMessage(name + " " + number).setCancelable(false);
        _alert.setPositiveButton("통화", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });
        _alert.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        _alert.show();
    }

    private int calcXYLocation(int val, float Height, int select)
    {
        return (int)(val * Height / baseHeight);
    }
}
