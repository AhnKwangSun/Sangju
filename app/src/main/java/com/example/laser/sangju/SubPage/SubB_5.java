package com.example.laser.sangju.SubPage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

public class SubB_5 extends AppCompatActivity {
    ImageView homeButton;
    ImageView b1, b2, b3, b4;
    private float baseWidth = 1080;
    private float baseHeight = 2476;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_b5);

        homeButton = (ImageView) findViewById(R.id.img_home);
        b1 = (ImageView) findViewById(R.id.sub_b5_i1_img);


        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubB_5.this, MainActivity.class);
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
                    if (EventX >= calcXYLocation(980,viewWidth,2) && EventX <= calcXYLocation(1040,viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://horse-riding.sangju.go.kr/"));
                            startActivity(intent);
                        }
                    }
                }
                return false;
            }
        });
    }

    private int calcXYLocation(int val, float Height, int select)
    {
        if(select == 1)
            return (int)(val * Height / baseHeight);
        else
            return  (int)(val*Height / baseWidth);
    }

}
