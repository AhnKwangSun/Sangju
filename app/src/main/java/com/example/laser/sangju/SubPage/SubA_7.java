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

public class SubA_7 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1;
    private float baseWidth = 1080;
    private float baseHeight = 1115;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a7);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a7_i1_img);
        a1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();
                float startBaseX = 975  * view.getWidth() / baseWidth;
                float endBaseX = 1050 * view.getWidth() / baseWidth;
                Log.e("Location:", "x = " + EventX + " y=" + EventY);

                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(40,viewHeight,1) && EventY <= calcXYLocation(100,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("낙동면 축구,배드민턴 경기장","054-811-7111");
                        }
                    } else if(EventY >= calcXYLocation(520,viewHeight,1) && EventY <= calcXYLocation(580,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("화북면 풋살,족구,농구장","054-339-7413");
                        }
                    }
                }
                return false;
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_7.this, MainActivity.class);
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
