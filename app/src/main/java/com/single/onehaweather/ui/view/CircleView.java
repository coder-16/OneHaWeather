package com.single.onehaweather.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.single.onehaweather.R;

/**
 * Created by lenovo on 2018/3/5.
 * 自定义控件 自定义属性 监听事件
 */

public class CircleView extends View implements View.OnTouchListener {
    private float x = 0;
    private float y = 0;
    Paint mPaint = null;

    public CircleView(Context context) {
        super(context);
        setOnTouchListener(this);
        Log.i("CCC",">>>>111");
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(this);
        Log.i("CCC",">>>>222");
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnTouchListener(this);
        Log.i("CCC",">>>>333");
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setOnTouchListener(this);
        Log.i("CCC",">>>>444");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setColor(getResources().getColor(R.color.colorAccent, null));
        mPaint.setStrokeWidth(15);
        canvas.drawLine(0, 0, x, y, mPaint);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_DOWN:
                x =motionEvent.getX();
                y =motionEvent.getY();
                invalidate();
                return true;


        }
        return super.onTouchEvent(motionEvent);
    }
}
