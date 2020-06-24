package com.example.everydaydifferentmeal;
// 인트로 화면 클래스
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends AppCompatActivity {
    private final int SPLASH_DP_TIME = 3000;      // 인트로 화면 로딩시간(3초)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //핸들러 추가
        Handler handler = new Handler();
        //post Delayed 함수
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //spalsh 엑티비티 실행
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_DP_TIME);


    }
}