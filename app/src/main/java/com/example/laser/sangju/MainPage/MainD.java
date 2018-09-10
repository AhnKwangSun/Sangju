package com.example.laser.sangju.MainPage;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.laser.sangju.MainActivity;
import com.example.laser.sangju.R;
import com.example.laser.sangju.SubPage.SubC_4;

/**
 * Created by Laser on 2017-11-07.
 */

public class MainD extends AppCompatActivity {
    Button btn[] = new Button[10];
    ImageView img[] = new ImageView[15];
    int imageArray[] = {R.id.sub_d1_i1_img, R.id.sub_d1_i2_img, R.id.sub_d1_i3_img, R.id.sub_d1_i4_img, R.id.sub_d1_i5_img, R.id.sub_d1_i6_img, R.id.sub_d1_i7_img, R.id.sub_d1_i8_img, R.id.sub_d1_i9_img, R.id.sub_d1_i10_img, R.id.sub_d1_i11_img, R.id.sub_d1_i12_img, R.id.sub_d1_i13_img, R.id.sub_d1_i14_img, R.id.sub_d1_i15_img};
    ImageView homeButton;
    Spinner spinner;
    private float baseWidth = 1080;
    private float baseHeightPic1 = 496;     //검도
    private float baseHeightPic2 = 882;     //골프
    private float baseHeightPic3 = 754;     //무용
    private float baseHeightPic4 = 616;     //우슈
    private float baseHeightPic5 = 376;     //유도
    private float baseHeightPic6 = 757;     //탁구
    private float baseHeightPic7 = 3039;    //당구
    private float baseHeightPic8 = 2785;    //태권도
    private float baseHeightPic9 = 3156;     //태권도
    private float baseHeightPic10 = 622;    //테니스
    private float baseHeightPic11 = 742;    //합기도
    private float baseHeightPic12 = 1135;    //헬스
    private float baseHeightPic13 = 487;    //볼링
    private float baseHeightPic14 = 378;    //바둑
    private float baseHeightPic15 = 496;    //국궁

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maind);
        homeButton = (ImageView) findViewById(R.id.img_home);
        spinner = (Spinner) findViewById(R.id.spinner);

        for (int i = 0; i < 15; i++) {
            img[i] = (ImageView) findViewById(imageArray[i]);
            img[i].setOnTouchListener(touchListener);
        }

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainD.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[0].setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[1].setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[2].setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[3].setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[4].setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[5].setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[6].setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[7].setVisibility(View.VISIBLE);
                        img[8].setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[9].setVisibility(View.VISIBLE);
                        break;
                    case 9:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[10].setVisibility(View.VISIBLE);
                        break;
                    case 10:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[11].setVisibility(View.VISIBLE);
                        break;
                    case 11:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[12].setVisibility(View.VISIBLE);
                        break;
                    case 12:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[13].setVisibility(View.VISIBLE);
                        break;
                    case 13:
                        for(int i=0; i<15; i++)
                            img[i].setVisibility(View.GONE);
                        img[14].setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void Dialog_Default(String name, final String number) {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("전화걸기");
        _alert.setMessage(name + " " + number).setCancelable(false);
        _alert.setPositiveButton("통화", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });
        _alert.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        _alert.show();
    }

    private int calcXYLocation(int val, float Height, int select) {
        int rslt;
        switch (select) {
            case 1:
                rslt = (int) (val * Height / baseHeightPic1);
                break;
            case 2:
                rslt = (int) (val * Height / baseHeightPic2);
                break;
            case 3:
                rslt = (int) (val * Height / baseHeightPic3);
                break;
            case 4:
                rslt = (int) (val * Height / baseHeightPic4);
                break;
            case 5:
                rslt = (int) (val * Height / baseHeightPic5);
                break;
            case 6:
                rslt = (int) (val * Height / baseHeightPic6);
                break;
            case 7:
                rslt = (int) (val * Height / baseHeightPic7);
                break;
            case 8:
                rslt = (int) (val * Height / baseHeightPic8);
                break;
            case 9:
                rslt = (int) (val * Height / baseHeightPic9);
                break;
            case 10:
                rslt = (int) (val * Height / baseHeightPic10);
                break;
            case 11:
                rslt = (int) (val * Height / baseHeightPic11);
                break;
            case 12:
                rslt = (int) (val * Height / baseHeightPic12);
                break;
            case 13:
                rslt = (int) (val * Height / baseHeightPic13);
                break;
            case 14:
                rslt = (int) (val * Height / baseHeightPic14);
                break;
            default:
                rslt = (int) (val * Height / baseHeightPic15);
                break;
        }
        return rslt;
    }

    private View.OnTouchListener touchListener = (new View.OnTouchListener() {
        float EventX;
        float EventY;
        float viewHeight;
        float startBaseX;
        float endBaseX;

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            switch (view.getId()) {
                case R.id.sub_d1_i1_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 1);

                    break;
                case R.id.sub_d1_i2_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 2);
                    break;
                case R.id.sub_d1_i3_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 3);
                    break;
                case R.id.sub_d1_i4_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 4);
                    break;
                case R.id.sub_d1_i5_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 5);
                    break;
                case R.id.sub_d1_i6_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 6);
                    break;
                case R.id.sub_d1_i7_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 7);
                    break;
                case R.id.sub_d1_i8_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 8);
                    break;
                case R.id.sub_d1_i9_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 830 * view.getWidth() / baseWidth;
                    endBaseX = 1020 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 9);
                    break;
                case R.id.sub_d1_i10_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 10);
                    break;
                case R.id.sub_d1_i11_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 11);
                    break;
                case R.id.sub_d1_i12_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 12);
                    break;
                case R.id.sub_d1_i13_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 13);
                    break;
                case R.id.sub_d1_i14_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 14);
                    break;
                case R.id.sub_d1_i15_img:
                    EventX = motionEvent.getX();
                    EventY = motionEvent.getY();
                    viewHeight = view.getHeight();
                    startBaseX = 900 * view.getWidth() / baseWidth;
                    endBaseX = 1030 * view.getWidth() / baseWidth;
                    Log.e("Location:", "x = " + view.getWidth() + " y=" + view.getHeight());
                    Log.e("Location:", "x = " + EventX + " y=" + EventY);
                    findLocation(EventX, EventY, startBaseX, endBaseX, viewHeight, action, motionEvent, 15);
                    break;

            }
            return false;
        }
    });

    private void findLocation(float EventX, float EventY, float startBaseX, float endBaseX, float viewHeight, int action, MotionEvent motionEvent,int select) {

        switch (select)
        {
            case 1:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(205,viewHeight,select) && EventY <= calcXYLocation(318,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주시검도수련관","054-536-0889");
                        }
                    } else if(EventY >= calcXYLocation(335,viewHeight,select) && EventY <= calcXYLocation(444,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("해동검도","054-541-0253");
                        }
                    }
                }
            break;
            case 2:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(211,viewHeight,select) && EventY <= calcXYLocation(324,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("화산골프연습장","054-541-1551");
                        }
                    } else if(EventY >= calcXYLocation(340,viewHeight,select) && EventY <= calcXYLocation(446,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("에이스골프 연습장","054-541-0754");
                        }
                    } else if(EventY >= calcXYLocation(466,viewHeight,select) && EventY <= calcXYLocation(576,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("오렌지 골프랜드","054-531-3090");
                        }
                    } else if(EventY >= calcXYLocation(596,viewHeight,select) && EventY <= calcXYLocation(700,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("탑골프랜드","054-534-7200");
                        }
                    } else if(EventY >= calcXYLocation(724,viewHeight,select) && EventY <= calcXYLocation(828,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("만산골프장","054-531-1133");
                        }
                    }
                }
            break;
            case 3:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(213,viewHeight,select) && EventY <= calcXYLocation(322,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("이창선무용학원","054-536-8401");
                        }
                    } else if(EventY >= calcXYLocation(341,viewHeight,select) && EventY <= calcXYLocation(450,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("이슬기무용학원","054-535-9800");
                        }
                    } else if(EventY >= calcXYLocation(470,viewHeight,select) && EventY <= calcXYLocation(575,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("S벨리댄스","010-8855-5676");
                        }
                    } else if(EventY >= calcXYLocation(594,viewHeight,select) && EventY <= calcXYLocation(698,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("신은정재즈&에어로빅학원","054-533-1181");
                        }
                    }
                }
            break;
            case 4:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(219,viewHeight,select) && EventY <= calcXYLocation(326,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("천무체육관","054-535-3209");
                        }
                    } else if(EventY >= calcXYLocation(351,viewHeight,select) && EventY <= calcXYLocation(452,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("우슈동양체육관","054-536-1556");
                        }
                    } else if(EventY >= calcXYLocation(473,viewHeight,select) && EventY <= calcXYLocation(578,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("쿵후소림관","054-533-7981");
                        }
                    }
                }
            break;
            case 5:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(209,viewHeight,select) && EventY <= calcXYLocation(320,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("용무도체육관","054-532-0987");
                        }
                    }
                }
            break;
            case 6:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(213,viewHeight,select) && EventY <= calcXYLocation(324,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("오픈탁구교실","054-532-5399");
                        }
                    } else if(EventY >= calcXYLocation(345,viewHeight,select) && EventY <= calcXYLocation(452,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("김재현탁구교실","054-531-0636");
                        }
                    } else if(EventY >= calcXYLocation(470,viewHeight,select) && EventY <= calcXYLocation(576,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("전환정탁구점","054-536-0080");
                        }
                    } else if(EventY >= calcXYLocation(598,viewHeight,select) && EventY <= calcXYLocation(704,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("함창탁구교실","054-541-8891");
                        }
                    }
                }
                break;
            case 7:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(209,viewHeight,select) && EventY <= calcXYLocation(334,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("아카데미당구클럽","054-536-4526");
                        }
                    } else if(EventY >= calcXYLocation(357,viewHeight,select) && EventY <= calcXYLocation(481,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("JS 당구클럽","054-536-4158");
                        }
                    } else if(EventY >= calcXYLocation(505,viewHeight,select) && EventY <= calcXYLocation(629,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("스포츠당구클럽","054-536-4272");
                        }
                    } else if(EventY >= calcXYLocation(653,viewHeight,select) && EventY <= calcXYLocation(775,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("공때리네당구장","054-541-0123");
                        }
                    } else if(EventY >= calcXYLocation(799,viewHeight,select) && EventY <= calcXYLocation(915,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("스카이당구클럽","054-533-4939");
                        }
                    } else if(EventY >= calcXYLocation(942,viewHeight,select) && EventY <= calcXYLocation(1061,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            // 터미널당구클럽 번호가 없댱
                        }
                    } else if(EventY >= calcXYLocation(1087,viewHeight,select) && EventY <= calcXYLocation(1207,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("나이스당구클럽","054-536-2900");
                        }
                    } else if(EventY >= calcXYLocation(11230,viewHeight,select) && EventY <= calcXYLocation(1356,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            // 동성당구장 번호가 없댱
                        }
                    } else if(EventY >= calcXYLocation(1382,viewHeight,select) && EventY <= calcXYLocation(1504,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("규당쿠클럽","054-535-0979");
                        }
                    } else if(EventY >= calcXYLocation(1525,viewHeight,select) && EventY <= calcXYLocation(1651,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("마니아당구클럽","054-535-0700");
                        }
                    } else if(EventY >= calcXYLocation(1671,viewHeight,select) && EventY <= calcXYLocation(1797,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("스포츠당구클럽","054-536-4272");
                        }
                    } else if(EventY >= calcXYLocation(1815,viewHeight,select) && EventY <= calcXYLocation(1941,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주당구장","054-535-3758");
                        }
                    } else if(EventY >= calcXYLocation(1966,viewHeight,select) && EventY <= calcXYLocation(2089,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("알까기 당구클럽","010-4123-5252");
                        }
                    } else if(EventY >= calcXYLocation(2111,viewHeight,select) && EventY <= calcXYLocation(2237,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("제일당구장","054-533-0841");
                        }
                    } else if(EventY >= calcXYLocation(2257,viewHeight,select) && EventY <= calcXYLocation(2383,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("영당구장","054-541-0067");
                        }
                    } else if(EventY >= calcXYLocation(2403,viewHeight,select) && EventY <= calcXYLocation(2525,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("한미당구장","054-541-7665");
                        }
                    } else if(EventY >= calcXYLocation(2551,viewHeight,select) && EventY <= calcXYLocation(2671,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("지구당구장","054-535-4817");
                        }
                    } else if(EventY >= calcXYLocation(2696,viewHeight,select) && EventY <= calcXYLocation(2817,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("모이세당구클럽","054-535-7721");
                        }
                    } else if(EventY >= calcXYLocation(2842,viewHeight,select) && EventY <= calcXYLocation(2961,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("중앙당구장","054-536-1757");
                        }
                    }
                }
                break;

            case 8:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(221,viewHeight,select) && EventY <= calcXYLocation(373,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("청덕체육관","054-531-3231");
                        }
                    } else if(EventY >= calcXYLocation(406,viewHeight,select) && EventY <= calcXYLocation(554,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("화성체육관","011-9582-2023");
                        }
                    } else if(EventY >= calcXYLocation(588,viewHeight,select) && EventY <= calcXYLocation(740,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("충효체육관","054-535-3377");
                        }
                    } else if(EventY >= calcXYLocation(771,viewHeight,select) && EventY <= calcXYLocation(925,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("아라한태권도장","054-532-3020");
                        }
                    }else if(EventY >= calcXYLocation(956,viewHeight,select) && EventY <= calcXYLocation(1109,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("엘리트태권도체육관","054-536-3630");
                        }
                    } else if(EventY >= calcXYLocation(1143,viewHeight,select) && EventY <= calcXYLocation(1285,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("가온누리태권도장","054-536-2046");
                        }
                    } else if(EventY >= calcXYLocation(1320,viewHeight,select) && EventY <= calcXYLocation(1478,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("리더스태권도클럽","054-536-6635");
                        }
                    }else if(EventY >= calcXYLocation(1506,viewHeight,select) && EventY <= calcXYLocation(1661,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("계명대선인태권도","054-536-6684");
                        }
                    } else if(EventY >= calcXYLocation(1692,viewHeight,select) && EventY <= calcXYLocation(1844,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("영일체육관","054-535-7888");
                        }
                    } else if(EventY >= calcXYLocation(1870,viewHeight,select) && EventY <= calcXYLocation(2024,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("한빛체육관","054-535-6546");
                        }
                    }else if(EventY >= calcXYLocation(20557,viewHeight,select) && EventY <= calcXYLocation(22050,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("화랑체육관","054-535-5779");
                        }
                    } else if(EventY >= calcXYLocation(2242,viewHeight,select) && EventY <= calcXYLocation(2392,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("김교철체육관","054-536-0166");
                        }
                    } else if(EventY >= calcXYLocation(2427,viewHeight,select) && EventY <= calcXYLocation(2575,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("영광체육관","054-534-7203");
                        }
                    } else if(EventY >= calcXYLocation(2610,viewHeight,select) && EventY <= calcXYLocation(2758,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("용인대백호체육관","054-541-4282");
                        }
                    }
                }
                break;
            case 9:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(4,viewHeight,select) && EventY <= calcXYLocation(160,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("실로암체육관","054-533-5261");
                        }
                    } else if(EventY >= calcXYLocation(187,viewHeight,select) && EventY <= calcXYLocation(343,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("효덕체육관","054-535-4227");
                        }
                    }else if(EventY >= calcXYLocation(379,viewHeight,select) && EventY <= calcXYLocation(528,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("낙동체육관","054-534-1066");
                        }
                    } else if(EventY >= calcXYLocation(552,viewHeight,select) && EventY <= calcXYLocation(714,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("현대체육관","054-535-0117");
                        }
                    } else if(EventY >= calcXYLocation(743,viewHeight,select) && EventY <= calcXYLocation(899,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("사벌체육관","054-533-5261");
                        }
                    }else if(EventY >= calcXYLocation(923,viewHeight,select) && EventY <= calcXYLocation(1074,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("우호체육관","054-536-5421");
                        }
                    } else if(EventY >= calcXYLocation(1113,viewHeight,select) && EventY <= calcXYLocation(1261,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("충무체육관","054-534-6500");
                        }
                    } else if(EventY >= calcXYLocation(1290,viewHeight,select) && EventY <= calcXYLocation(1446,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("경희대 한국체육관","054-536-0303");
                        }
                    }else if(EventY >= calcXYLocation(1476,viewHeight,select) && EventY <= calcXYLocation(1623,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("청마체육관","054-532-5214");
                        }
                    } else if(EventY >= calcXYLocation(1660,viewHeight,select) && EventY <= calcXYLocation(1808,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("가야체육관","054-541-2543");
                        }
                    } else if(EventY >= calcXYLocation(1846,viewHeight,select) && EventY <= calcXYLocation(1995,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상무체육관","054-535-0344");
                        }
                    } else if(EventY >= calcXYLocation(2031,viewHeight,select) && EventY <= calcXYLocation(2169,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("삼백체육관","054-531-1441");
                        }
                    } else if(EventY >= calcXYLocation(2212,viewHeight,select) && EventY <= calcXYLocation(2352,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("한미체육관","054-353-5170");
                        }
                    } else if(EventY >= calcXYLocation(2398,viewHeight,select) && EventY <= calcXYLocation(2541,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("중앙체육관","054-532-0606");
                        }
                    } else if(EventY >= calcXYLocation(2579,viewHeight,select) && EventY <= calcXYLocation(2719,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("경북체육관","054-535-5298");
                        }
                    }else if(EventY >= calcXYLocation(2760,viewHeight,select) && EventY <= calcXYLocation(2908,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("승일체육관","054-535-3032");
                        }
                    } else if(EventY >= calcXYLocation(2948,viewHeight,select) && EventY <= calcXYLocation(3089,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주체육관","054-534-4921");
                        }
                    }
                }
            break;
            case 10:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(209,viewHeight,select) && EventY <= calcXYLocation(316,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("시민테니스장","054-536-2994");
                        }
                    } else if(EventY >= calcXYLocation(341,viewHeight,select) && EventY <= calcXYLocation(440,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상록실내테니스장","054-532-7909");
                        }
                    } else if(EventY >= calcXYLocation(468,viewHeight,select) && EventY <= calcXYLocation(570,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("우방테니스장","054-533-5070");
                        }
                    }
                }
                break;
            case 11:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(213,viewHeight,select) && EventY <= calcXYLocation(316,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("무성종합체육관","054-536-8987");
                        }
                    } else if(EventY >= calcXYLocation(337,viewHeight,select) && EventY <= calcXYLocation(444,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("합기도무예관","054-536-7045");
                        }
                    } else if(EventY >= calcXYLocation(462,viewHeight,select) && EventY <= calcXYLocation(560,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("성무관","054-535-5515");
                        }
                    } else if(EventY >= calcXYLocation(584,viewHeight,select) && EventY <= calcXYLocation(692,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("진성체육관","054-534-3691");
                        }
                    }
                }
                break;
            case 12:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(213,viewHeight,select) && EventY <= calcXYLocation(322,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("강남헬스클럽","054-535-2646");
                        }
                    } else if(EventY >= calcXYLocation(341,viewHeight,select) && EventY <= calcXYLocation(450,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("다이어트헬스클럽","054-535-6004");
                        }
                    } else if(EventY >= calcXYLocation(472,viewHeight,select) && EventY <= calcXYLocation(578,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("굿바디짐","054-536-2332");
                        }
                    } else if(EventY >= calcXYLocation(596,viewHeight,select) && EventY <= calcXYLocation(704,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("그랜드헬스","054-536-0383");
                        }
                    } else if(EventY >= calcXYLocation(720,viewHeight,select) && EventY <= calcXYLocation(828,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("메트릭스헬스","054-534-3320");
                        }
                    } else if(EventY >= calcXYLocation(844,viewHeight,select) && EventY <= calcXYLocation(952,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("동아헬스","054-536-3707");
                        }
                    } else if(EventY >= calcXYLocation(976,viewHeight,select) && EventY <= calcXYLocation(1083,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("웰리스휘트니스센터","054-535-1102");
                        }
                    }
                }
                break;
            case 13:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(211,viewHeight,select) && EventY <= calcXYLocation(320,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상주월드컵 볼링경기장","054-534-5300");
                        }
                    } else if(EventY >= calcXYLocation(341,viewHeight,select) && EventY <= calcXYLocation(452,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("동영볼링장","054-535-0925");
                        }
                    }
                }
                break;
            case 14:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(215,viewHeight,select) && EventY <= calcXYLocation(322,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("한국기원(상주지부)","054-536-2044");
                        }
                    }
                }
                break;
            case 15:
                if (EventX >= startBaseX  && EventX <= endBaseX) {
                    if(EventY >= calcXYLocation(213,viewHeight,select) && EventY <= calcXYLocation(324,viewHeight,select)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Dialog_Default("상무정","054-533-3132");
                        }
                } else if(EventY >= calcXYLocation(339,viewHeight,select) && EventY <= calcXYLocation(440,viewHeight,select)) {
                    if (action == motionEvent.ACTION_DOWN) {
                        Dialog_Default("상산정","054-534-9836");
                    }
                }
                }
                break;
        }
    }
}
