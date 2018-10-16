package com.renhui.audiodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ServiceActivity extends AppCompatActivity {
  List<Long> startdown =new ArrayList<>();
    List<Long> enddown=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        startdown.add(1539603886455L);
        enddown.add(539603886654L);

        startdown.add(1539603886854L);
        enddown.add(1539603886970L);

        startdown.add(1539603887187L);
        enddown.add(1539603887396L);


        startdown.add(1539603887649L);
        enddown.add(1539603887885L);

        startdown.add(1539603888133L);
        enddown.add(1539603888338L);

        startdown.add(1539603888513L);
        enddown.add(1539603888708L);

        startdown.add(1539603888895L);
        enddown.add(11539603889078L);

        startdown.add(1539603889181L);
        enddown.add(1539603889366L);

        startdown.add(1539603889526L);
        enddown.add(1539603889646L);

        startdown.add(1539603889838L);
        enddown.add(1539603890004L);


        for (int i = 0; i <startdown.size() ; i++) {
            String s = TimeDifference(enddown.get(i), startdown.get(i));

            Log.e("**", "onCreate: "+s);
        }


    }

    /**
     *此方法为计算时间差精确到毫秒
     *
     */


    public static String TimeDifference(long start, long end) {

        long between = end - start;
        long day = between / (24 * 60 * 60 * 1000);
        long hour = (between / (60 * 60 * 1000) - day * 24);
        long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        long ms = (between - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000
                - min * 60 * 1000 - s * 1000);
        String timeDifference = day + "天" + hour + "小时" + min + "分" + s + "秒" + ms
                + "毫秒";
        return timeDifference;
    }
}
