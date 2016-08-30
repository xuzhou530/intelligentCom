package com.example.tick.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tick.myapplication.Home.HomeActivity;
import com.example.tick.myapplication.Mine.MineActivity;
import com.example.tick.myapplication.Propery.PropreyActivity;
import com.example.tick.myapplication.Topic.TopicActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{
    private List<Fragment> fragments;
    private ViewPager viewPager;
    private HomeActivity homeActivity;
    private MineActivity mineActivity;
    private PropreyActivity propreyActivity;
    private TopicActivity topicActivity;
    private LinearLayout home,proprey,mine,topic;
    private TextView tv_home,tv_proprey,tv_mine,tv_topic;
    private ImageView iv_home,iv_proprey,iv_mine,iv_topic;
    private FragmentPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//取消标题栏
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        home = (LinearLayout) findViewById(R.id.home);
        proprey = (LinearLayout) findViewById(R.id.propery);
        topic = (LinearLayout) findViewById(R.id.topic);
        mine = (LinearLayout) findViewById(R.id.mine);
        homeActivity = new HomeActivity();
        mineActivity = new MineActivity();
        propreyActivity = new PropreyActivity();
        topicActivity = new TopicActivity();
        //导航栏文字
        tv_home = (TextView) findViewById(R.id.main_tv_home);
        tv_proprey = (TextView) findViewById(R.id.main_tv_proprey);
        tv_topic= (TextView) findViewById(R.id.main_tv_topic);
        tv_mine = (TextView) findViewById(R.id.main_tv_mine);
        //导航栏图片
        iv_home = (ImageView) findViewById(R.id.main_iv_home);
        iv_proprey = (ImageView) findViewById(R.id.main_iv_proprey);
        iv_topic = (ImageView) findViewById(R.id.main_iv_topic);
        iv_mine = (ImageView) findViewById(R.id.main_iv_mine);

        fragments = new ArrayList<>();
        fragments.add(homeActivity);
        fragments.add(propreyActivity);
        fragments.add(topicActivity);
        fragments.add(mineActivity);
        pagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        reSetTextColor();
        switch (position){
            case 0:
                iv_home.setImageResource(R.mipmap.home1);
                tv_home.setTextColor(Color.parseColor("#5e86f2"));
                break;
            case 1:
                iv_proprey.setImageResource(R.mipmap.proprey1);
                tv_proprey.setTextColor(Color.parseColor("#5e86f2"));
                break;
            case 2:
                iv_topic.setImageResource(R.mipmap.topic1);
                tv_topic.setTextColor(Color.parseColor("#5e86f2"));
                break;
            case 3:
                iv_mine.setImageResource(R.mipmap.mine1);
                tv_mine.setTextColor(Color.parseColor("#5e86f2"));
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    //重新设置字体的颜色，图片
    public void reSetTextColor(){
        tv_home.setTextColor(Color.parseColor("#757575"));
        tv_proprey.setTextColor(Color.parseColor("#757575"));
        tv_topic.setTextColor(Color.parseColor("#757575"));
        tv_mine.setTextColor(Color.parseColor("#757575"));
        iv_home.setImageResource(R.mipmap.home0);
        iv_proprey.setImageResource(R.mipmap.propery0);
        iv_topic.setImageResource(R.mipmap.topic0);
        iv_mine.setImageResource(R.mipmap.mine0);
    }
}
