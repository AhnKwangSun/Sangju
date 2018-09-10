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

public class SubC_2 extends AppCompatActivity {

//
ImageView homeButton;
    ImageView c1, c2, left, right, imageViewer;
    int[] imgs = {R.drawable.sub_c2_p1, R.drawable.sub_c2_p2, R.drawable.sub_c2_p3, R.drawable.sub_c2_p4, R.drawable.sub_c2_p5, R.drawable.sub_c2_p6};
    int currentImage = 0;

    private float baseWidth = 1080;
    private float baseHeightPic1 = 1086;
    private float baseHeightPic2 = 1183;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_c2);

        homeButton = (ImageView) findViewById(R.id.img_home);
        c1 = (ImageView) findViewById(R.id.sub_c2_i1_img);
        c2 = (ImageView) findViewById(R.id.sub_c2_i2_img);
        left = (ImageView) findViewById(R.id.left_icon);
        right = (ImageView) findViewById(R.id.right_icon);
        imageViewer = (ImageView) findViewById(R.id.imageViewer);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubC_2.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        c1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();
                float startBaseX = 937  * view.getWidth() / baseWidth;
                float endBaseX = 1053 * view.getWidth() / baseWidth;
                Log.e("Location:", "x = " + EventX + " y=" + EventY);

                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(25,viewHeight,1) && EventY <= calcXYLocation(121,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상산초등학교 농구부","054-532-3851");
                        }
                    } else if(EventY >= calcXYLocation(339,viewHeight,1) && EventY <= calcXYLocation(433,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주중앙초등학교 농구부","054-532-3841");
                        }
                    } else if(EventY >= calcXYLocation(725,viewHeight,1) && EventY <= calcXYLocation(822,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주중학교 농구부","054-533-1082");
                        }
                    }
                }
                return false;
            }
        });

        c2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();
                float startBaseX = 937  * view.getWidth() / baseWidth;
                float endBaseX = 1053 * view.getWidth() / baseWidth;
                Log.e("Location:", "x = " + EventX + " y=" + EventY);

                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(25,viewHeight,2) && EventY <= calcXYLocation(123,viewHeight,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주여자중학교 농구부","054-534-1318");
                        }
                    } else if(EventY >= calcXYLocation(420,viewHeight,2) && EventY <= calcXYLocation(510,viewHeight,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주전자고등학교 농구부","054-532-1515");
                        }
                    } else if(EventY >= calcXYLocation(810,viewHeight,2) && EventY <= calcXYLocation(900,viewHeight,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주여자고등학교 농구부","054-530-8601");
                        }
                    }
                }
                return false;
            }
        });


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentImage != 0)
                {
                    currentImage--;
                    imageViewer.setBackgroundResource(imgs[currentImage]);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentImage != 5)
                {
                    currentImage++;
                    imageViewer.setBackgroundResource(imgs[currentImage]);
                }
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
        {
            return (int)(val * Height / baseHeightPic1);
        } else {
            return (int)(val * Height / baseHeightPic2);
        }
    }


}
