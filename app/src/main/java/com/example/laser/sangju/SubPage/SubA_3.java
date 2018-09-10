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

public class SubA_3 extends AppCompatActivity {
    ImageView homeButton;
    ImageView a1, a2, a3, a4 ,a5, left, right, imageViewer;
    ScrollView scr;
    int[] imgs = {R.drawable.sub_a3_p1, R.drawable.sub_a3_p2, R.drawable.sub_a3_p3, R.drawable.sub_a3_p4};
    int currentImage = 0;
    private float baseWidth = 1080;
    private float baseHeight = 967;
    private float baseScrollHeight = 6781;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_a3);

        homeButton = (ImageView) findViewById(R.id.img_home);
        a1 = (ImageView) findViewById(R.id.sub_a3_i1_img);
        a2 = (ImageView) findViewById(R.id.sub_a3_i2_img);
        a3 = (ImageView) findViewById(R.id.sub_a3_i3_img);
        a4 = (ImageView) findViewById(R.id.sub_a3_i4_img);
        a5 = (ImageView) findViewById(R.id.sub_a3_i5_img);
        left = (ImageView) findViewById(R.id.left_icon);
        right = (ImageView) findViewById(R.id.right_icon);
        imageViewer = (ImageView) findViewById(R.id.imageViewer);
        scr = (ScrollView) findViewById(R.id.scr);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SubA_3.this, MainActivity.class);
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
                if(currentImage != 3)
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
                    if (EventX >= calcXYLocation(850, viewWidth,2)  && EventX <=  calcXYLocation(930, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sportspark.sangju.go.kr"));
                            startActivity(intent);
                        } else if(EventX >=  calcXYLocation(960, viewWidth,2)  && EventX <=  calcXYLocation(1040, viewWidth,2)) {
                            if (action == motionEvent.ACTION_DOWN) {
                                Dialog_Default("국민체육센터", "054-532-7173");
                            }
                        }
                    }
                } else if (EventY >= calcXYLocation(214, viewHeight, 1) && EventY <= calcXYLocation(331, viewHeight, 1)) {
                    if (EventX >= calcXYLocation(282, viewWidth,2)  && EventX <=  calcXYLocation(463, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(967,scrollHeight,3));
                        }
                    }else if(EventX >=  calcXYLocation(490, viewWidth,2)  && EventX <=  calcXYLocation(655, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(1267,scrollHeight,3));
                        }
                    } else if(EventX >=  calcXYLocation(668, viewWidth,2)  && EventX <=  calcXYLocation(837, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(1567,scrollHeight,3));
                        }
                    } else if(EventX >=  calcXYLocation(850, viewWidth,2)  && EventX <=  calcXYLocation(1040, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(2425,scrollHeight,3));
                        }
                    }
                } else if (EventY >= calcXYLocation(347, viewHeight, 1) && EventY <= calcXYLocation(464, viewHeight, 1)) {
                    if (EventX >= calcXYLocation(307, viewWidth,2)  && EventX <=  calcXYLocation(509, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(2725,scrollHeight,3));
                        }
                    }else if(EventX >=  calcXYLocation(576, viewWidth,2)  && EventX <=  calcXYLocation(745, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(3125,scrollHeight,3));
                        }
                    } else if(EventX >=  calcXYLocation(821, viewWidth,2)  && EventX <=  calcXYLocation(1019, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(3963,scrollHeight,3));
                        }
                    }
                } else if (EventY >= calcXYLocation(475, viewHeight, 1) && EventY <= calcXYLocation(593, viewHeight, 1)) {
                    if (EventX >= calcXYLocation(323, viewWidth,2)  && EventX <=  calcXYLocation(480, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(4583,scrollHeight,3));
                        }
                    }else if(EventX >=  calcXYLocation(557, viewWidth,2)  && EventX <=  calcXYLocation(764, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(4923,scrollHeight,3));
                        }
                    } else if(EventX >=  calcXYLocation(806, viewWidth,2)  && EventX <=  calcXYLocation(1027, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(5371,scrollHeight,3));
                        }
                    }
                } else if (EventY >= calcXYLocation(606, viewHeight, 1) && EventY <= calcXYLocation(719, viewHeight, 1)) {
                    if (EventX >= calcXYLocation(292, viewWidth,2)  && EventX <=  calcXYLocation(518, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(6721,scrollHeight,3));

                        }
                    }else if(EventX >=  calcXYLocation(538, viewWidth,2)  && EventX <=  calcXYLocation(787, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(6721,scrollHeight,3));
                        }
                    } else if(EventX >=  calcXYLocation(808, viewWidth,2)  && EventX <=  calcXYLocation(1031, viewWidth,2)) {
                        if (action == motionEvent.ACTION_DOWN) {
                            scr.scrollTo(0,calcXYLocation(6721,scrollHeight,3));
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
