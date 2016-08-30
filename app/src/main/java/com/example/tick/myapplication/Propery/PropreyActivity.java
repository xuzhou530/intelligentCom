package com.example.tick.myapplication.Propery;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.tick.myapplication.R;

/**
 * Created by Tick on 2016/8/29.
 */
public class PropreyActivity extends Fragment implements View.OnClickListener{
    private View view;
    private LinearLayout payment,booksee,record,suggest;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_propery,container,false);
        initView();
        return view;
    }

    private void initView() {
        payment = (LinearLayout) view.findViewById(R.id.propery_ll_payment);
        booksee = (LinearLayout) view.findViewById(R.id.propery_ll_booksee);
        record = (LinearLayout) view.findViewById(R.id.propery_ll_record);
        suggest = (LinearLayout) view.findViewById(R.id.propery_ll_suggest);
        //设置监听
        payment.setOnClickListener(this);
        booksee.setOnClickListener(this);
        record.setOnClickListener(this);
        suggest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.propery_ll_payment:
                intent = new Intent(getContext(),PaymentActivity.class);
                intent.putExtra("title","物业缴费");
                break;
            case R.id.propery_ll_booksee:
                intent = new Intent(getContext(),RecordActivity.class);
                intent.putExtra("title","缴费记录");
                break;
            case R.id.propery_ll_record:
                intent = new Intent(getContext(),BookseeActivity.class);
                intent.putExtra("title","预约看房");
                break;
            case R.id.propery_ll_suggest:
                intent = new Intent(getContext(),SuggestActivity.class);
                intent.putExtra("title","投诉建议");
                break;
        }
    }
}
