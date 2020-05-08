# FastSplashSample
android splash image

Android启动页图片 

首先为了解决启动页白屏问题

```
    <style name="AppTheme.Splash" parent="Theme.AppCompat.NoActionBar">
        <item name="android:windowBackground">@drawable/bg_splash</item>
        <item name="android:windowFullscreen">true</item>
    </style>
```
```
<activity android:name=".SplashActivity"
            android:theme="@style/AppTheme.Splash">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
</activity>
```
这样启动时不会闪白屏


但是现在的手机屏幕种类繁多，除了1920*1080的分辨率外，很多手机的高度都不一样，使用上述方法加载时会不同程度的拉伸变形，影响美观。
通过观察许多主流的app,发现他们的启动页都是纯色背景+中间图片+加底部logo;

这里进行如下改进
新建一个background_splash.xml
```
<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android"
     >
    <!--白色矩形 作为背景色-->
    <item>
        <shape android:shape="rectangle">
            <solid android:color="#FFFFFF" />
        </shape>
    </item>
    
    <!--启动页面图片-->
    <item android:gravity="center">
        <bitmap android:src="@drawable/splash_monkey"
            android:gravity="center"
            />
    </item>

    <!--启动页面logo-->
    <item
        android:gravity="bottom"
        android:bottom="60dp">
        <bitmap
            android:gravity="bottom"
            android:src="@drawable/bg_splash_bottom" />
    </item>
</layer-list>
```
将刚才的windowBackground改成xml
```
<style name="AppTheme.Splash" parent="Theme.AppCompat.NoActionBar">
        <item name="android:windowBackground">@drawable/background_splash</item>
        <item name="android:windowFullscreen">true</item>
</style>
```

需要注意的是，使用的两张图片的宽度也不能大于屏幕宽度。

此外，如果项目引入了第三方的屏幕适配方法，也要将启动页排除掉，不然冷启动之后，启动页可能会有抖动变形

