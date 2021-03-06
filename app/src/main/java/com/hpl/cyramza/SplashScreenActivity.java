package com.hpl.cyramza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000;
    PreConfig preConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        preConfig = new PreConfig(this);
        startSplash();
    }

    private void startSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (!preConfig.readUserName().isEmpty())
                {
                    startActivity(new Intent(SplashScreenActivity.this,HomeActivity.class));
                    finish();
                }
                else
                {
                    startActivity(new Intent(SplashScreenActivity.this,LoginActivity.class));
                    finish();
                }


            }
        },SPLASH_TIME_OUT);
    }
}