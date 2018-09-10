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
import android.widget.Scroller;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;

/**
 * Created by Laser on 2017-11-08.
 */

public class SubA_1 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1, a2, a3, a4, a5, a6 ,a7, a8, left, right, imageViewer;
    ScrollView scr;
    int[] imgs = {R.drawable.sub_a1_p1, R.drawable.sub_a1_p2, R.drawable.sub_a1_p3};
    int currentImage = 0;
    private float baseWidth = 1080;          // FHD에서 이미지 너비비율 기본값
    private float baseHeight = 890;          // FHD에서 이미지 높이비율 기본값
    private float baseScrollHeight = 6781;  // FHD에서 스크롤뷰에서 화면비율 기본값

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a1);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a1_i1_img);
        a2 = (ImageView) findViewById(R.id.sub_a1_i2_img);
        a3 = (ImageView) findViewById(R.id.sub_a1_i3_img);
        a4 = (ImageView) findViewById(R.id.sub_a1_i4_img);
        a5 = (ImageView) findViewById(R.id.sub_a1_i5_img);
        a6 = (ImageView) findViewById(R.id.sub_a1_i6_img);
        a7 = (ImageView) findViewById(R.id.sub_a1_i7_img);
        a8 = (ImageView) findViewById(R.id.sub_a1_i8_img);
        left = (ImageView) findViewById(R.id.left_icon);
        right = (ImageView) findViewById(R.id.right_icon);
        imageViewer = (ImageView) findViewById(R.id.imageViewer);
        scr = (ScrollView) findViewById(R.id.scr);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_1.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
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
                if(currentImage != 2)
                {
                    currentImage++;
                    imageViewer.setBackgroundResource(imgs[currentImage]);
                }
            }
        });

        a1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                float EventX = motionEvent.getX();
                float EventY = motionEvent.getY();
                float viewHeight = view.getHeight();
                float viewWidth = view.getWidth();
                float scrollHeight = scr.getChildAt(0).getHeight();
                Log.e("Location:", "x = " + EventX + " y=" + EventY);
                Log.e("totalHeight:", "height = " + scr.getChildAt(0).getHeight());

                    if (EventY >= calcXYLocation(50, viewHeight, 1) && EventY <= calcXYLocation(145, viewHeight, 1)) {
                        if(EventX >= calcXYLocation(960, viewWidth, 2)  && EventX <= calcXYLocation(1040, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("시민운동장", "054-533-5117");
                            }
                        }
                    } else if (EventY >= calcXYLocation(459, viewHeight, 1) && EventY <= calcXYLocation(576, viewHeight, 1)) {
                        if(EventX >= calcXYLocation(284, viewWidth, 2)  && EventX <= calcXYLocation(503, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(865, scrollHeight, 3));
                            }
                        } else if(EventX >= calcXYLocation(555, viewWidth, 2)  && EventX <= calcXYLocation(773, viewWidth, 2))  {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(1458, scrollHeight, 3));                            }
                        } else if(EventX >= calcXYLocation(808, viewWidth, 2)  && EventX <= calcXYLocation(1027, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(2328, scrollHeight, 3));
                            }
                        }
                    } else if(EventY >= calcXYLocation(588, viewHeight, 1)  && EventY <= calcXYLocation(709, viewHeight, 1)) {
                        if(EventX >= calcXYLocation(284, viewWidth, 2)  && EventX <= calcXYLocation(503, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(3006, scrollHeight, 3));
                            }
                        } else if(EventX >= calcXYLocation(555, viewWidth, 2)  && EventX <= calcXYLocation(773, viewWidth, 2))  {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(3780, scrollHeight, 3));                            }
                        } else if(EventX >= calcXYLocation(808, viewWidth, 2)  && EventX <= calcXYLocation(1027, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(4482, scrollHeight, 3));
                            }
                        }
                    } else if(EventY >= calcXYLocation(720, viewHeight, 1)  && EventY <= calcXYLocation(830, viewHeight, 1)) {
                        if(EventX >= calcXYLocation(284, viewWidth, 2)  && EventX <= calcXYLocation(503, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(4882, scrollHeight, 3));
                            }
                        } else if(EventX >= calcXYLocation(555, viewWidth, 2)  && EventX <= calcXYLocation(773, viewWidth, 2))  {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(5182, scrollHeight, 3));                            }
                        } else if(EventX >= calcXYLocation(808, viewWidth, 2)  && EventX <= calcXYLocation(1027, viewWidth, 2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                scr.scrollTo(0,calcXYLocation(5812, scrollHeight, 3));
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
        } else if(select == 2) {
            return (int) (val * Height /  baseWidth);
        } else {
            return (int) (val * Height /  baseScrollHeight);
        }
    }
}
