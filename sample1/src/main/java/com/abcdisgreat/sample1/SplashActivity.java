package com.abcdisgreat.sample1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.xiaojinzi.component.impl.Router;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        try {
//            Thread.sleep(3000);
//            startActivity(new Intent(this,MainActivity.class));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Router.with(this)
                .host("ModuleA")
                .path("ModuleA_FeatureOneActivity")
                .forward();
    }
}