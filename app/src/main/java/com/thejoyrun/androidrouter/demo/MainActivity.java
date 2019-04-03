package com.thejoyrun.androidrouter.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.thejoyrun.router.OtherURL;
import com.thejoyrun.router.Router;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("uid", "233");
            intent.putExtra("age", "24");
            intent.putExtra("time", System.currentTimeMillis());
            intent.putExtra("name", "Wiki");
            intent.putExtra("man", "true");
            intent.putExtra("manger", "true");
            startActivity(intent);
        } else if (v.getId() == R.id.button2) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.setData(Uri.parse("test://second?uid=233&age=24&name=Wiki"));
            startActivity(intent);
        } else if (v.getId() == R.id.button3) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.setData(Uri.parse("test://second?uid=233&age=24"));
            intent.putExtra("time", System.currentTimeMillis());
            intent.putExtra("name", "Wiki");
            intent.putExtra("man", "true");
            intent.putExtra("manger", "true");
            startActivity(intent);
        } else if (v.getId() == R.id.button4) {
            Router.startActivity(this, "test://second/third?uid=233&age=24");
        } else if (v.getId() == R.id.button5) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("test://second?uid=233&age=24")));
        } else if (v.getId() == R.id.button6) {
            Router.startActivity(this, "test://www.thejoyrun.com/second?uid=233&age=24");
        } else if (v.getId() == R.id.button7) {
            OtherURL.builder().age(12).id(24).start(this);
        }else if (v.getId() == R.id.button8) {
            Intent intent = Router.getIntent(this,"test://other?uid=233&age=24");
            startActivity(intent);
//            Router.startActivity(this, "test://other?uid=233&age=24");
        }
    }
}
