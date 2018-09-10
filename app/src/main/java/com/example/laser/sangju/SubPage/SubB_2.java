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

public class SubB_2 extends AppCompatActivity {
    ImageView homeButton;
    ImageView b1, b2, b3, b4;
    ScrollView scr;
    private float baseWidth = 1080;
    private float baseHeight = 1758;
    private float baseScrollHeight = 7339;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_b2);

        homeButton = (ImageView) findViewById(R.id.img_home);
        b1 = (ImageView) findViewById(R.id.sub_b2_i1_img);
        b2 = (ImageView) findViewById(R.id.sub_b2_i2_img);
        b3 = (ImageView) findViewById(R.id.sub_b2_i3_img);
        b4 = (ImageView) findViewById(R.id.sub_b2_i4_img);
        scr = (ScrollView) findViewById(R.id.scr);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubB_2.this, MainActivity.class);
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

                if(EventY >= calcXYLocation(130,viewHeight,1) && EventY <= calcXYLocation(192,viewHeight,1)) {
                    if (EventX >= calcXYLocation(330,viewWidth,2) && EventX <= calcXYLocation(476,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("1번","1");
                            scr.scrollTo(0,calcXYLocation(401,scrollHeight,3));
                        }
                    } else if (EventX >= calcXYLocation(518,viewWidth,2) && EventX <= calcXYLocation(6515,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("2번","2");
                            scr.scrollTo(0,calcXYLocation(1758,scrollHeight,3));

                        }
                    } else if (EventX >= calcXYLocation(670,viewWidth,2) && EventX <= calcXYLocation(867,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("3번","3");
                            scr.scrollTo(0,calcXYLocation(2358,scrollHeight,3));

                        }
                    } else if (EventX >= calcXYLocation(879,viewWidth,2) && EventX <= calcXYLocation(1034,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("4번","4");
                            scr.scrollTo(0,calcXYLocation(2908,scrollHeight,3));

                        }
                    }
                } else if(EventY >= calcXYLocation(201,viewHeight,1) && EventY <= calcXYLocation(267,viewHeight,1)) {
                    if (EventX >= calcXYLocation(342,viewWidth,2) && EventX <= calcXYLocation(528,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("5번","1");
                            scr.scrollTo(0,calcXYLocation(3358,scrollHeight,3));
                        }
                    } else if (EventX >= calcXYLocation(582,viewWidth,2) && EventX <= calcXYLocation(781,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("6번","2");
                            scr.scrollTo(0,calcXYLocation(3808,scrollHeight,3));

                        }
                    } else if (EventX >= calcXYLocation(850,viewWidth,2) && EventX <= calcXYLocation(1040,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("7번","2");
                            scr.scrollTo(0,calcXYLocation(4886,scrollHeight,3));
                        }
                    }
                } else if(EventY >= calcXYLocation(274,viewHeight,1) && EventY <= calcXYLocation(334,viewHeight,1)) {
                    if (EventX >= calcXYLocation(325,viewWidth,2) && EventX <= calcXYLocation(550,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("7번","1");
                            scr.scrollTo(0,calcXYLocation(5326,scrollHeight,3));
                        }
                    } else if (EventX >= calcXYLocation(610,viewWidth,2) && EventX <= calcXYLocation(810,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("8번","2");
                            scr.scrollTo(0,calcXYLocation(5826,scrollHeight,3));

                        }
                    } else if (EventX >= calcXYLocation(833,viewWidth,2) && EventX <= calcXYLocation(1040,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("9번","3");
                            scr.scrollTo(0,calcXYLocation(7339,scrollHeight,3));

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
