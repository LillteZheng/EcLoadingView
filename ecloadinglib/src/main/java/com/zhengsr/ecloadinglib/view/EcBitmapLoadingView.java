package com.zhengsr.ecloadinglib.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.zhengsr.ecloadinglib.R;

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
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.EcBitmapLoadingView);
        mAnimList = ta.getResourceId(R.styleable.EcBitmapLoadingView_ec_bitmap_anim_list,0);
        if (mAnimList == 0){
            throw  new RuntimeException("ec_bitmap_anim_list  needed be set");
        }
        setBackgroundResource(mAnimList);
        ta.recycle();
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
}
