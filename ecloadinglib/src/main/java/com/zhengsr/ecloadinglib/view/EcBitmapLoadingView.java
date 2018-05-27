package com.zhengsr.ecloadinglib.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.zhengsr.ecloadinglib.R;
import com.zhengsr.ecloadinglib.utils.HandlerUtils;

/**
 * Created by zhengshaorui on 2018/4/7.
 */

@SuppressLint("AppCompatCustomView")
public class EcBitmapLoadingView extends ImageView  {
    private int mAnimList;
    private AnimationDrawable mAnimationDrawable;
    public EcBitmapLoadingView(Context context) {
        this(context,null);
    }

    public EcBitmapLoadingView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public EcBitmapLoadingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mAnimList = R.drawable.ecloading_bitmap_anim;
        setBackgroundResource(mAnimList);
    }


    public void startAnim(){
        if (mAnimationDrawable == null){
            mAnimationDrawable = (AnimationDrawable) getBackground();
        }
        mAnimationDrawable.stop();
        mAnimationDrawable.start();
    }

    public void stopAnim(){
        if (mAnimationDrawable != null){
            mAnimationDrawable.stop();
        }
    }


    @Override
    protected void onWindowVisibilityChanged(final int visibility) {
        super.onWindowVisibilityChanged(visibility);
        // Log.d(TAG, "zsr --> onWindowVisibilityChanged: "+visibility);
        HandlerUtils.handlePost(500, new HandlerUtils.handlerListener() {
            @Override
            public void post() {
                if (visibility == View.VISIBLE){
                    startAnim();
                }else {
                    stopAnim();
                }
            }
        });


    }
}
