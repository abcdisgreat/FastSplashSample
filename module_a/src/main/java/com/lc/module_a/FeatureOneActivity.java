package com.lc.module_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lc.base.TestComponentError;
import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.impl.Router;

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


        TextView tv = findViewById(R.id.tv_test);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestComponentError.Test1();
            }
        });
    }
}