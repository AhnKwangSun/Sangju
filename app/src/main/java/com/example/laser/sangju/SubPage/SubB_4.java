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

public class SubB_4 extends AppCompatActivity {
    ImageView homeButton;
    ImageView b1;
    private float baseWidth = 1080;
    private float baseHeight = 1221;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_b4);

        homeButton = (ImageView) findViewById(R.id.img_home);
        b1 = (ImageView) findViewById(R.id.sub_b4_i1_img);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubB_4.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();
                float viewWidth = view.getWidth();
                Log.e("Location:", "x = " + EventX + " y=" + EventY);

                if(EventY >= calcXYLocation(20,viewHeight,1) && EventY <= calcXYLocation(100,viewHeight,1)) {
                    if (EventX >= calcXYLocation(830,viewWidth,2) && EventX <= calcXYLocation(920,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sports.knu.ac.kr"));
                            startActivity(intent);
                        }
                    } else if(EventX >= calcXYLocation(980,viewWidth,2) && EventX <= calcXYLocation(1040,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("경북대학교","054-530-1728");
                        }
                    }
                }
                return false;
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
        if(select == 1)
            return (int)(val * Height / baseHeight);
        else
            return  (int)(val*Height / baseWidth);
    }

}
