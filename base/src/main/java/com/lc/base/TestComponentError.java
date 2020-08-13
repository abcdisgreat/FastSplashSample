package com.lc.base;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ToastUtils;

/**
 * @author：lc
 * @date：2020/8/13 0013
 * @desc：// TODO
 */
public class TestComponentError {

    public static void Test1() {
        String appName = AppUtils.getAppName();
        ToastUtils.showLong(appName);
    }

}
