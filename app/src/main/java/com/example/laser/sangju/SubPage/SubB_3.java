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
import android.widget.ScrollView;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;

/**
 * Created by Laser on 2017-11-08.
 */

public class SubB_3 extends AppCompatActivity {
    ImageView homeButton;
    ImageView b1, b2, b3, b4;
    ScrollView scr;
    private float baseWidth = 1080;
    private float baseHeight = 598;
    private float baseScrollHeight = 4381;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_b3);

        homeButton = (ImageView) findViewById(R.id.img_home);
        b1 = (ImageView) findViewById(R.id.sub_b3_i1_img);
        b2 = (ImageView) findViewById(R.id.sub_b3_i2_img);
        b3 = (ImageView) findViewById(R.id.sub_b3_i3_img);
        b4 = (ImageView) findViewById(R.id.sub_b3_i4_img);
        scr = (ScrollView) findViewById(R.id.scr);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubB_3.this, MainActivity.class);
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
                float scrollHeight = scr.getChildAt(0).getHeight();
                Log.e("Location:", "x = " + EventX + " y=" + EventY);
                Log.e("",""+scrollHeight);

                if(EventY >= calcXYLocation(20,viewHeight,1) && EventY <= calcXYLocation(100,viewHeight,1)) {
                    if (EventX >= calcXYLocation(830,viewWidth,2) && EventX <= calcXYLocation(920,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangjufc.co.kr"));
                            startActivity(intent);
                        }
                    } else if(EventX >= calcXYLocation(980,viewWidth,2) && EventX <= calcXYLocation(1040,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주상무축구단","054-537-7220");
                        }
                    }
                } else if(EventY >= calcXYLocation(134,viewHeight,1) && EventY <= calcXYLocation(195,viewHeight,1)) {
                    if (EventX >= calcXYLocation(360,viewWidth,2) && EventX <= calcXYLocation(740,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(399,scrollHeight,3));
                    } else if(EventX >= calcXYLocation(840,viewWidth,2) && EventX <= calcXYLocation(1030,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(1185,scrollHeight,3));
                    }
                } else if(EventY >= calcXYLocation(205,viewHeight,1) && EventY <= calcXYLocation(270,viewHeight,1)) {
                    if (EventX >= calcXYLocation(360,viewWidth,2) && EventX <= calcXYLocation(740,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(1730,scrollHeight,3));
                    } else if(EventX >= calcXYLocation(840,viewWidth,2) && EventX <= calcXYLocation(1030,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(2166,scrollHeight,3));
                    }
                } else if(EventY >= calcXYLocation(276,viewHeight,1) && EventY <= calcXYLocation(338,viewHeight,1)) {
                    if (EventX >= calcXYLocation(360,viewWidth,2) && EventX <= calcXYLocation(1030,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(2588,scrollHeight,3));
                    }
                } else if(EventY >= calcXYLocation(349,viewHeight,1) && EventY <= calcXYLocation(409,viewHeight,1)) {
                    if (EventX >= calcXYLocation(560,viewWidth,2) && EventX <= calcXYLocation(830,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(2969,scrollHeight,3));
                    }
                } else if(EventY >= calcXYLocation(416,viewHeight,1) && EventY <= calcXYLocation(478,viewHeight,1)) {
                    if (EventX >= calcXYLocation(360,viewWidth,2) && EventX <= calcXYLocation(1030,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(3019,scrollHeight,3));
                    }
                } else if(EventY >= calcXYLocation(487,viewHeight,1) && EventY <= calcXYLocation(5477,viewHeight,1)) {
                    if (EventX >= calcXYLocation(430,viewWidth,2) && EventX <= calcXYLocation(970,viewWidth,2)) {
                        scr.scrollTo(0,calcXYLocation(3019,scrollHeight,3));
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
        if(select == 1) {
            return (int) (val * Height / baseHeight);
        }
        else if(select == 2) {
            return (int) (val * Height / baseWidth);
        } else {
            return (int) (val * Height /  baseScrollHeight);
        }
    }


}
