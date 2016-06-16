package com.example.yangdianwen.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private FrameLayout frameLayout;
    private MyFragment1 mf1;
    private TextView tv_1;
    private TextView tv_2;
    private TextView tv_3;
    private TextView tv_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvents();
    }

    private void initView() {
        button_1 = (Button) findViewById(R.id.btn1);
        button_2 = (Button) findViewById(R.id.btn2);
        button_3 = (Button) findViewById(R.id.btn3);
        button_4 = (Button) findViewById(R.id.btn4);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        frameLayout = (FrameLayout) findViewById(R.id.mfl);
        fm = getFragmentManager();

    }
    private void initEvents() {
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        tv_3.setOnClickListener(this);
        tv_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                mf1 = new MyFragment1();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl, mf1);
                ft.commit();
                break;
            case R.id.btn2:
                MyFragment2 mf2=new MyFragment2();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf2);
                ft.commit();
                break;
            case R.id.btn3:
                MyFragment3 mf3=new MyFragment3();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf3);
                ft.commit();
                break;
            case R.id.btn4:
                MyFragment4 mf4=new MyFragment4();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf4);
                ft.commit();
                break;
            case R.id.tv_1:
                MyFragment1 mf_tv1=new MyFragment1();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf_tv1);
                ft.commit();
                break;
            case R.id.tv_2:
                MyFragment2 mf_tv2=new MyFragment2();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf_tv2);
                ft.commit();
                break;
            case R.id.tv_3:
                MyFragment3 mf_tv3=new MyFragment3();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf_tv3);
                ft.commit();
                break;
            case R.id.tv_4:
                MyFragment4 mf_tv4=new MyFragment4();
                //开启任务
                ft = fm.beginTransaction();
                ft.replace(R.id.mfl,mf_tv4);
                ft.commit();
                break;
        }

    }

}
