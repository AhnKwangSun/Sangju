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

public class SubC_5 extends AppCompatActivity {
    ImageView homeButton;
    ImageView c1 , left, right, imageViewer;
    int[] imgs = {R.drawable.sub_c5_p1, R.drawable.sub_c5_p2};
    int currentImage = 0;
    private float baseWidth = 1080;
    private float baseHeightPic1 = 787;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_c5);

        homeButton = (ImageView) findViewById(R.id.img_home);
        c1 = (ImageView) findViewById(R.id.sub_c5_i1_img);
        left = (ImageView) findViewById(R.id.left_icon);
        right = (ImageView) findViewById(R.id.right_icon);
        imageViewer = (ImageView) findViewById(R.id.imageViewer);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubC_5.this, MainActivity.class);
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
                            Dialog_Default("함창중학교 축구부","054-541-2296");
                        }
                    } else if(EventY >= calcXYLocation(420,viewHeight,1) && EventY <= calcXYLocation(510,viewHeight,1)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("용운고등학교 축구부", "054-532-3911");
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
                if(currentImage != 1)
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
        return (int)(val * Height / baseHeightPic1);
    }

}
