package com.zhengsr.ecloadingview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;

import com.zhengsr.ecloadinglib.view.EcBitmapLoadingView;
import com.zhengsr.ecloadinglib.view.EcJumpLoadingView;

public class MainActivity extends AppCompatActivity {

    Handler mHandler = new Handler(Looper.myLooper());
    private EcJumpLoadingView mEcJumpLoadingView;
    private EcBitmapLoadingView mEcBitmapLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEcJumpLoadingView = findViewById(R.id.ecloadview);
        mEcBitmapLoadingView = findViewById(R.id.ecbitmaploadview);


    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}



