package com.dreamguard.androiddemo;

import android.app.Application;
import android.content.Context;

import com.dreamguard.aframe.utils.AppContextUtil;


/**
 * 描述：
 * 作者：dc on 2017/2/16 10:54
 * 邮箱：597210600@qq.com
 */
public class MyApplication extends Application {

    public static Context applicationContext;


    public static Context getContext() {
        return applicationContext;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this;
        AppContextUtil.init(this);
    }
}
