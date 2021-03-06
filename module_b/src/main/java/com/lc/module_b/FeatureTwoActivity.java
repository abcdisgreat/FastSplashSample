package com.lc.module_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lc.base.TestComponentError;
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

        TextView tv = findViewById(R.id.tv_test);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestBean testBean = new TestBean("1","test1");
                TestComponentError.Test3(testBean.getText());
            }
        });
    }
}