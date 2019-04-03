package com.dream.app_module;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.thejoyrun.router.RouterActivity;
import com.thejoyrun.router.RouterField;
import com.thejoyrun.router.SecondURL;

@RouterActivity("other")
public class OtherActivity extends Activity implements View.OnClickListener {

    @RouterField("name")
    public String mName;
    @RouterField("age")
    public int age;
    @RouterField("id")
    public int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_module);
        findViewById(R.id.button_open_second).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        SecondURL.builder().age(12).start(this);
    }
}
