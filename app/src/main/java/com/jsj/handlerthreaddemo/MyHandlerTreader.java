package com.jsj.handlerthreaddemo;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by jiangshujing on 2018/3/8.
 * 在子线程中使用handler
 */

public class MyHandlerTreader {
    Handler mPoolThreadHander;

    private void init() {

        Thread mPoolThread = new Thread() {
            @Override
            public void run() {
                Looper.prepare();

                mPoolThreadHander = new Handler(Looper.myLooper());

                Looper.loop();
            }
        };

        mPoolThread.start();
    }


}
