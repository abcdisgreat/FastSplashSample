package com.abcdisgreat.sample1;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.Utils;
import com.xiaojinzi.component.Component;
import com.xiaojinzi.component.Config;
import com.xiaojinzi.component.impl.application.ModuleManager;

/**
 * @author：lc
 * @date：2020/8/13 0013
 * @desc：// TODO
 */
public class SampleA extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initRoute();
    }

    /**
     * 初始化组件化模块
     */
    private void initRoute() {
        // 初始化
        Component.init(
                AppUtils.isAppDebug(),
                Config.with(Utils.getApp())
                        .defaultScheme("bi-router")
                        // 使用内置的路由重复检查的拦截器, 如果为 true,
                        // 那么当两个相同的路由发生在指定的时间内后一个路由就会被拦截
                        .useRouteRepeatCheckInterceptor(true)
                        // 1000 是默认的, 表示相同路由拦截的时间间隔
                        .routeRepeatCheckDuration(1000)
                        // 是否打印日志提醒你哪些路由使用了 Application 为 Context 进行跳转
                        .tipWhenUseApplication(true)
                        .build()
        );
        ModuleManager.getInstance().registerArr(
                "ModuleA","ModuleB"
        );
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
