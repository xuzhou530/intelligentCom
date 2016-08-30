package com.example.tick.myapplication.Home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tick.myapplication.MainActivity;
import com.example.tick.myapplication.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Tick on 2016/8/29.
 */
public class HomeActivity extends Fragment implements View.OnClickListener{
    private ImageView repair,post,education,housekeeping,school,oldmanhome;
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_home, container, false);
        initView();
        return view;
    }

    private void initView() {
        repair = (ImageView) view.findViewById(R.id.home_iv_repair);
        post = (ImageView) view.findViewById(R.id.home_iv_post);
        education = (ImageView) view.findViewById(R.id.home_iv_education);
        housekeeping = (ImageView) view.findViewById(R.id.home_iv_housekeeping);
        school = (ImageView) view.findViewById(R.id.home_iv_school);
        oldmanhome = (ImageView) view.findViewById(R.id.home_iv_oldmanhome);
        repair.setOnClickListener(this);
        post.setOnClickListener(this);
        education.setOnClickListener(this);
        housekeeping.setOnClickListener(this);
        school.setOnClickListener(this);
        oldmanhome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.home_iv_repair:
                intent = new Intent(getContext(),RepairActivity.class);
                intent.putExtra("title","自助修理");
                startActivity(intent);
                break;
            case R.id.home_iv_post:
                intent = new Intent(getContext(),PostActivity.class);
                intent.putExtra("title","上门寄件");
                startActivity(intent);
                break;
            case R.id.home_iv_education:
                intent = new Intent(getContext(),EducationActivity.class);
                intent.putExtra("title","家教培训");
                startActivity(intent);
                break;
            case R.id.home_iv_housekeeping:
                intent = new Intent(getContext(),HouseKeepingActivity.class);
                intent.putExtra("title","家政上门");
                startActivity(intent);
                break;
            case R.id.home_iv_school:
                intent = new Intent(getContext(),SchoolActivity.class);
                intent.putExtra("title","入学办理");
                startActivity(intent);
                break;
            case R.id.home_iv_oldmanhome:
                intent = new Intent(getContext(),OldManHomeActivity.class);
                intent.putExtra("title","老人之家");
                startActivity(intent);
                break;
        }
    }
}
