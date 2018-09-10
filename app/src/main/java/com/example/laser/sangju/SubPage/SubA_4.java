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
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;

/**
 * Created by Laser on 2017-11-08.
 */

public class SubA_4 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1, a2, a3;
    Spinner spinner;
    private float baseWidth = 1080;
    private float baseHeight1 = 2022;
    private float baseHeight2 = 1225;
    private float baseHeight3 = 1225;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a4);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a4_i1_img);
        a2 = (ImageView) findViewById(R.id.sub_a4_i2_img);
        a3 = (ImageView) findViewById(R.id.sub_a4_i3_img);
        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        a1.setVisibility(View.VISIBLE);
                        a2.setVisibility(View.GONE);
                        a3.setVisibility(View.GONE);
                        break;
                    case 1:
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.VISIBLE);
                        a3.setVisibility(View.GONE);
                        break;
                    case 2:
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.GONE);
                        a3.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        a1.setOnTouchListener(listener);
        a2.setOnTouchListener(listener);
        a3.setOnTouchListener(listener);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_4.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

    }

    private View.OnTouchListener listener  = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            float EventX;
            float EventY;
            float viewHeight;
            float startBaseX;
            float endBaseX;

            switch (view.getId()) {
                case R.id.sub_a4_i1_img:
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900  * view.getWidth() / baseWidth;
                    endBaseX = 1020 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);

                    if (EventX >= startBaseX  && EventX <= endBaseX) {
                        if(EventY >= calcXYLocation(215,viewHeight,1) && EventY <= calcXYLocation(315,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=1&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=173"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(365,viewHeight,1) && EventY <= calcXYLocation(465,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=1&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=172"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(515,viewHeight,1) && EventY <= calcXYLocation(615,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=1&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=171"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(665,viewHeight,1) && EventY <= calcXYLocation(765,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=1&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=170"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(815,viewHeight,1) && EventY <= calcXYLocation(915,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=1&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=169"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(965,viewHeight,1) && EventY <= calcXYLocation(1065,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=2&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=168"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(1115,viewHeight,1) && EventY <= calcXYLocation(1215,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=2&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=167"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(1265,viewHeight,1) && EventY <= calcXYLocation(1315,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=2&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=166"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(1415,viewHeight,1) && EventY <= calcXYLocation(1515,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=2&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=165"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(1565,viewHeight,1) && EventY <= calcXYLocation(1665,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=2&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=164"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(1715,viewHeight,1) && EventY <= calcXYLocation(1815,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=3&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=163"));
                                startActivity(intent);
                            }
                        } else if(EventY >= calcXYLocation(1865,viewHeight,1) && EventY <= calcXYLocation(1965,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sangju.go.kr/tour/main/main.jsp?home_url=tour&code=TOUR_TOUR_6&table_name=TOUR&pageNumber=3&groupingField=TOUR_TOUR_6&tour_url=tour_read.jsp&write_seq=162"));
                                startActivity(intent);
                            }
                        }
                    }
                    break;
                case R.id.sub_a4_i2_img:

                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 320  * view.getWidth() / baseWidth;
                    endBaseX = 1020 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);

                    if (EventX >= startBaseX  && EventX <= endBaseX) {
                        if(EventY >= calcXYLocation(125,viewHeight,1) && EventY <= calcXYLocation(160,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("생활체육공원","054-532-7173");
                            }
                        }
                    }
                    break;
                case R.id.sub_a4_i3_img:

                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 320  * view.getWidth() / baseWidth;
                    endBaseX = 1020 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);

                    if (EventX >= startBaseX  && EventX <= endBaseX) {
                        if(EventY >= calcXYLocation(125,viewHeight,1) && EventY <= calcXYLocation(160,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("생활체육공원","054-532-7173");
                            }
                        }
                    }
                    break;
            }
            return true;
        }
    };

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
        if(select==1)
        {
            return (int)(val * Height / baseHeight1);
        } else if (select == 2) {
            return (int)(val * Height / baseHeight2);
        } else {
            return (int)(val * Height / baseHeight3);
        }
    }



}
