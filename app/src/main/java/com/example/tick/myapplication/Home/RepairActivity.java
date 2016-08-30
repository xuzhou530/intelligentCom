package com.example.tick.myapplication.Home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tick.myapplication.R;

import butterknife.OnClick;

/**
 * Created by Tick on 2016/8/30.
 */
public class RepairActivity extends Activity implements View.OnClickListener{
    private TextView title;
    private ImageView iv_back;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_repair);
        initView();
    }

    private void initView() {
        title = (TextView) findViewById(R.id.many_top_title);
        iv_back = (ImageView) findViewById(R.id.many_top_back);
        ok = (Button) findViewById(R.id.repair_bt_ok);
        //获取标题并且设置标题
        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        iv_back.setOnClickListener(this);
        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.many_top_back:
                finish();
                break;
            case R.id.repair_bt_ok:
                //判空方法
                if(isEmpty()) {
                    Toast.makeText(RepairActivity.this, "提交成功，谢谢您的支持", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    Toast.makeText(RepairActivity.this, "不能为空", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public boolean isEmpty() {
        return true;
    }
}
