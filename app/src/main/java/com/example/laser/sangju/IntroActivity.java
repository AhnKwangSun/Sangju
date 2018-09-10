package com.example.laser.sangju;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {

    final Handler handler = new Handler();
    ImageView img;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        img = (ImageView) findViewById(R.id.introImg);
        mRunnable = new Runnable() {
            public void run() {
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
                finish();
            }
        };

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.removeCallbacks(mRunnable);
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }
        });

        handler.postDelayed(mRunnable,5000);
    }

    @Override
    public void onBackPressed() {
        /* 뒤로가기를 눌러도 종료되지 않게 재정의 */
    }

}
