package com.yuki.yukihub;

import android.app.Application;

import com.yuki.yukihub.util.UiScaleUtil;

public class YukiHubApp extends Application {
    @Override
    protected void attachBaseContext(android.content.Context base) {
        super.attachBaseContext(UiScaleUtil.wrap(base));
    }
}
