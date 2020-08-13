package com.lc.module_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xiaojinzi.component.anno.RouterAnno;

@RouterAnno(
        host = "ModuleB",
        path = "ModuleB_FeatureTwoActivity",
        desc = "FeatureTwoActivity"
)
public class FeatureTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featrue_two);
    }
}