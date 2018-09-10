package com.example.laser.sangju.SubPage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Laser on 2017-11-08.
 */

public class SubA_2 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1, a2, a3;
    Spinner spinner;
    int[] imgs = {R.drawable.sub_a2_i1, R.drawable.sub_a2_i2, R.drawable.sub_a2_i3};

    private float baseWidth = 1080;
    private float baseHeightPic1 = 3286;
    private float baseHeightPic2 = 1954;
    private float baseHeightPic3 = 2161;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a2);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a2_i1_img);
        a2 = (ImageView) findViewById(R.id.sub_a2_i2_img);
        a3 = (ImageView) findViewById(R.id.sub_a2_i3_img);
        spinner = (Spinner) findViewById(R.id.spinner);

        a1.setOnTouchListener(listener);
        a2.setOnTouchListener(listener);
        a3.setOnTouchListener(listener);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_2.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });


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

    }


    private View.OnTouchListener listener  = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();

            switch (view.getId()) {
                case R.id.sub_a2_i1_img:
                    //og.e("Location:", "x = " + motionEvent.getX() + " y=" + motionEvent.getY());

                    float EventX = motionEvent.getX();
                    float EventY = motionEvent.getY();
                    float viewHeight = view.getHeight();
                    float startBaseX = 950  * view.getWidth() / baseWidth;
                    float endBaseX = 1040 * view.getWidth() / baseWidth;

                    if (EventX >= startBaseX  && EventX <= endBaseX) {
                        //Log.e("Location:", "x = "  + EventY + "  " + viewHeight + "  " +  calcXYLocation((int)EventY,viewHeight,1));
                        if(EventY >= calcXYLocation(240,viewHeight,1) && EventY <= calcXYLocation(380,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("상산초등학교","054-532-2092");
                            }
                        } else if(EventY >= calcXYLocation(430,viewHeight,1) && EventY <= calcXYLocation(530,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("상주중앙초등학교","054-534-4664");
                            }
                        } else if(EventY >= calcXYLocation(620,viewHeight,1) && EventY <= calcXYLocation(720,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("상영초등학교","054-532-7794");
                            }
                        } else if(EventY >= calcXYLocation(810,viewHeight,1) && EventY<= calcXYLocation(910,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("성동초등학교","054-536-4841");
                            }
                        } else if(EventY >= calcXYLocation(1000,viewHeight,1) && EventY <= calcXYLocation(1100,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("상주남부초등학교","054-533-7407");
                            }
                        } else if(EventY >= calcXYLocation(1190,viewHeight,1) && EventY <= calcXYLocation(1290,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("사벌초등학교","054-531-1031");
                            }
                        } else if(EventY >= calcXYLocation(1380,viewHeight,1) && EventY <= calcXYLocation(1480,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("낙동초등학교","054-532-9452");
                            }
                        } else if(EventY >= calcXYLocation(1570,viewHeight,1) && EventY <= calcXYLocation(1670,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("청리초등학교","054-534-2234");
                            }
                        } else if(EventY >= calcXYLocation(1760,viewHeight,1) && EventY <= calcXYLocation(1860,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("외남초등학교","054-533-1244");
                            }
                        } else if(EventY >= calcXYLocation(1950,viewHeight,1) && EventY <= calcXYLocation(2050,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("모서초등학교","054-533-2184");
                            }
                        } else if(EventY >= calcXYLocation(2140,viewHeight,1) && EventY <= calcXYLocation(2240,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("화동초등학교","054-533-9720");
                            }
                        } else if(EventY >= calcXYLocation(2330,viewHeight,1) && EventY <= calcXYLocation(2430,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("화령초등학교","054-534-5646");
                            }
                        } else if(EventY >= calcXYLocation(2520,viewHeight,1) && EventY <= calcXYLocation(2620,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("외서초등학교","054-532-7012");
                            }
                        } else if(EventY >= calcXYLocation(2710,viewHeight,1) && EventY <= calcXYLocation(2810,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("공검초등학교","054-541-1712");
                            }
                        } else if(EventY >= calcXYLocation(2900,viewHeight,1) && EventY <= calcXYLocation(3000,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("함창초등학교","054-541-0912");
                            }
                        } else if(EventY >= calcXYLocation(3090,viewHeight,1) && EventY <= calcXYLocation(3190,viewHeight,1)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("이안초등학교","054-541-5382");
                            }
                        }
                    }
                    break;
                case R.id.sub_a2_i2_img:
                    float EventX2 = motionEvent.getX();
                    float EventY2 = motionEvent.getY();
                    float viewHeight2 = view.getHeight();
                    float startBaseX2 = 850  * view.getWidth() / baseWidth;
                    float endBaseX2 = 1020 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + viewHeight2);


                    if (EventX2 >= startBaseX2  && EventX2 <= endBaseX2) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Log.e("Location:", "x = " + motionEvent.getX() + " y=" + motionEvent.getY());
                            if(EventY2 >= calcXYLocation(240,viewHeight2,2) && EventY2 <= calcXYLocation(380,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상주중학교","054-533-1081");
                                }
                            } else if(EventY2 >= calcXYLocation(430,viewHeight2,2) && EventY2 <= calcXYLocation(530,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("낙동중학교","054-534-3601");
                                }
                            } else if(EventY2 >= calcXYLocation(620,viewHeight2,2) && EventY2 <= calcXYLocation(730,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("화령중학교","054-532-0303");
                                }
                            } else if(EventY2 >= calcXYLocation(810,viewHeight2,2) && EventY2 <= calcXYLocation(910,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("내서중학교","054-533-4701");
                                }
                            } else if(EventY2 >= calcXYLocation(1000,viewHeight2,2) && EventY2 <= calcXYLocation(1100,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상주여자중학교","054-534-1316");
                                }
                            } else if(EventY2 >= calcXYLocation(1190,viewHeight2,2) && EventY2 <= calcXYLocation(1290,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("남산중학교","054-532-3412");
                                }
                            } else if(EventY2 >= calcXYLocation(1380,viewHeight2,2) && EventY2 <= calcXYLocation(1480,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("함창중학교","054-541-2295");
                                }
                            } else if(EventY2 >= calcXYLocation(1570,viewHeight2,2) && EventY2 <= calcXYLocation(1670,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("용운중학교","054-532-3910");
                                }
                            } else if(EventY2 >= calcXYLocation(1760,viewHeight2,2) && EventY2 <= calcXYLocation(1860,viewHeight2,2)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("성신여자중학교","054-531-3680");
                                }
                            }
                        }
                    }
                    break;
                case R.id.sub_a2_i3_img:
                    //Log.e("Location:", "x = " + motionEvent.getX() + " y=" + motionEvent.getY());

                    float EventX3 = motionEvent.getX();
                    float EventY3 = motionEvent.getY();
                    float viewHeight3 = view.getHeight();
                    float startBaseX3 = 850  * view.getWidth() / baseWidth;
                    float endBaseX3 = 1020 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + viewHeight3);

                    if (EventX3 >= startBaseX3  && EventX3 <= endBaseX3) {
                        if (action == motionEvent.ACTION_DOWN) {
                            //Log.e("Location:", "x = " + motionEvent.getX() + " y=" + motionEvent.getY());
                            if(EventY3 >= calcXYLocation(240,viewHeight3,3) && EventY3 <= calcXYLocation(380,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("화령고등학교","054-532-0303");
                                }
                            } else if(EventY3 >= calcXYLocation(430,viewHeight3,3) && EventY3 <= calcXYLocation(530,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상주여자고등학교","054-530-8600");
                                }
                            } else if(EventY3 >= calcXYLocation(620,viewHeight3,3) && EventY3 <= calcXYLocation(720,viewHeight3,3)){
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상산전자고등학교","054-532-1516");
                                }
                            } else if(EventY3 >= calcXYLocation(810,viewHeight3,3) && EventY3 <= calcXYLocation(910,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("중모고등학교","054-533-4081");
                                }
                            } else if(EventY3 >= calcXYLocation(1000,viewHeight3,3) && EventY3 <= calcXYLocation(1100,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상주고등학교","054-530-9100");
                                }
                            } else if(EventY3 >= calcXYLocation(1190,viewHeight3,3) && EventY3 <= calcXYLocation(1290,viewHeight3,3)){
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("함창고등학교","054-541-2295");
                                }
                            } else if(EventY3 >= calcXYLocation(1380,viewHeight3,3) && EventY3 <= calcXYLocation(1480,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("용운고등학교","054-532-3910");
                                }
                            }else if(EventY3 >= calcXYLocation(1570,viewHeight3,3) && EventY3 <= calcXYLocation(1670,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상주공업고등학교","054-532-3412");
                                }
                            } else if(EventY3 >= calcXYLocation(1760,viewHeight3,3) && EventY3 <= calcXYLocation(1860,viewHeight3,3)){
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("우석여자고등학교","054-531-3681");
                                }
                            }else if(EventY3 >= calcXYLocation(1950,viewHeight3,3) && EventY3 <= calcXYLocation(2050,viewHeight3,3)) {
                                if (action == motionEvent.ACTION_DOWN) {
                                    Dialog_Default("상지여자고등학교","054-541-3081");
                                }
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
        if(select == 1)
        {
            return (int)(val * Height / baseHeightPic1);
        } else if(select == 2)
        {
            return (int)(val * Height / baseHeightPic2);
        } else {
            return (int)(val * Height / baseHeightPic3);
        }
    }

}
