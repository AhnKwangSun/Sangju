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

public class SubC_4 extends AppCompatActivity {
    ImageView homeButton;
    ImageView c1, c2, c3 , left, right, imageViewer;
    int[] imgs = {R.drawable.sub_c4_p1, R.drawable.sub_c4_p2, R.drawable.sub_c4_p3, R.drawable.sub_c4_p4 };
    int currentImage = 0;
    private float baseWidth = 1080;
    private float baseHeightPic1 = 733;
    private float baseHeightPic2 = 730;
    private float baseHeightPic3 = 1149;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_c4);

        homeButton = (ImageView) findViewById(R.id.img_home);
        c1 = (ImageView) findViewById(R.id.sub_c4_i1_img);
        c2 = (ImageView) findViewById(R.id.sub_c4_i2_img);
        c3 = (ImageView) findViewById(R.id.sub_c4_i3_img);
        left = (ImageView) findViewById(R.id.left_icon);
        right = (ImageView) findViewById(R.id.right_icon);
        imageViewer = (ImageView) findViewById(R.id.imageViewer);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubC_4.this, MainActivity.class);
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
                    if(EventY >= calcXYLocation(30,viewHeight,1) && EventY <= calcXYLocation(120,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주초등학교 정구부","054-534-8712");
                        }
                    } else if(EventY >= calcXYLocation(382,viewHeight,1) && EventY <= calcXYLocation(473,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("옥산초등학교 정구부","054-532-3906");
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
                    if(EventY >= calcXYLocation(29,viewHeight,2) && EventY <= calcXYLocation(122,viewHeight,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("성신여자중학교 정구부","054-531-3690");
                        }
                    } else if(EventY >= calcXYLocation(380,viewHeight,2) && EventY <= calcXYLocation(470,viewHeight,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주여자중학교 정구부","054-534-1318");
                        }
                    }
                }
                return false;
            }
        });

        c3.setOnTouchListener(new View.OnTouchListener() {
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
                    if(EventY >= calcXYLocation(36,viewHeight,3) && EventY <= calcXYLocation(125,viewHeight,3)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("우석여자고등학교 정구부","054-531-3640");
                        }
                    } else if(EventY >= calcXYLocation(389,viewHeight,3) && EventY <= calcXYLocation(477,viewHeight,3)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주여자고등학교 정구부","054-530-8601");
                        }
                    } else if(EventY >= calcXYLocation(755,viewHeight,3) && EventY <= calcXYLocation(864,viewHeight,3)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주전자고등학교 정구부","054-532-1515");
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
                if(currentImage != 3)
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
        } else if(select == 2){
            return (int)(val * Height / baseHeightPic2);
        } else {
            return (int)(val * Height / baseHeightPic3);
        }
    }

}
