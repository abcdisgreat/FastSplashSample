package com.lc.base;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.xiaojinzi.component.impl.Router;

/**
 * @author：lc
 * @date：2020/8/13 0013
 * @desc：// TODO
 */
public class TestComponentError {

    public static void Test1() {
        Router.with()
                .host("ModuleB")
                .path("ModuleB_FeatureTwoActivity")
                .forward();
    }
    public static void Test2() {
        ToastUtils.showLong("点击事件");
    }
}
