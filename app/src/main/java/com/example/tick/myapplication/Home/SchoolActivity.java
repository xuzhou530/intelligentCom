package com.example.tick.myapplication.Home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tick.myapplication.R;

/**
 * Created by Tick on 2016/8/30.
 */
public class SchoolActivity extends Activity implements View.OnClickListener {
    private TextView title;
    private ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_school);
        initView();
    }

    private void initView() {
        title = (TextView) findViewById(R.id.many_top_title);
        iv_back = (ImageView) findViewById(R.id.many_top_back);
        //获取标题并且设置标题
        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        iv_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.many_top_back:
                finish();
                break;
        }
    }
}
