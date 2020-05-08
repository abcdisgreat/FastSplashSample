package com.abcdisgreat.sample2;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        hideBottomUIMenu();
        try {
            Thread.sleep(1500);
            ImageView iv = findViewById(R.id.iv_splash_ad);
            iv.setImageResource(R.drawable.bg_splash_ad);
            iv.setVisibility(View.VISIBLE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 隐藏虚拟按键，并且全屏
     */
    private void hideBottomUIMenu() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }
}