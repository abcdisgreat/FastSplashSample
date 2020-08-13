package com.lc.module_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lc.base.TestComponentError;
import com.xiaojinzi.component.anno.RouterAnno;

@RouterAnno(
        host = "ModuleA",
        path = "ModuleA_FeatureOneActivity",
        desc = "FeatureOneActivity"
)
public class FeatureOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_one);
        TestComponentError.Test1();
    }
}