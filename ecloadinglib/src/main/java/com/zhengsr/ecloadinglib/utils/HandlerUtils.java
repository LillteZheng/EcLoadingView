package com.zhengsr.ecloadinglib.utils;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by zhengshaorui on 2018/4/10.
 */

public class HandlerUtils {

    static Handler mHandler = new Handler(Looper.myLooper());
    public interface handlerListener{
        void post();
    }

    public static void handlePost(int time, final handlerListener listener){
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (listener != null){
                    listener.post();
                }
            }
        },time);
    }
}
