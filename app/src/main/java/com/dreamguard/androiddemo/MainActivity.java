package com.dreamguard.androiddemo;

import android.os.Bundle;
import android.widget.TextView;

import com.dreamguard.aframe.base.BaseActivity;
import com.dreamguard.aframe.base.BasePresenter;
import com.dreamguard.aframe.presenter.ParamPresenter;
import com.dreamguard.aframe.view.ParamView;


public class MainActivity extends BaseActivity implements ParamView {

    private TextView tvMessage;

    ParamPresenter paramPresenter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = (TextView) findViewById(R.id.message);

//        testOkHttp();

        paramPresenter.getData();

    }

    @Override
    public void initPresenter() {
        paramPresenter = new ParamPresenter();
    }

    @Override
    public BasePresenter getPresenter() {
        return paramPresenter;
    }

    @Override
    public void showData(String data) {
        tvMessage.setText(data);
    }

}
