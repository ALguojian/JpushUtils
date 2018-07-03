package com.alguojian.jpushutils;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/7/2
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
