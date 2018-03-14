package com.single.onehaweather.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.single.onehaweather.R;
import com.single.onehaweather.ui.view.CircleView;

import retrofit2.Retrofit;

/**
 * Created by lenovo on 2018/3/5.
 */

public class ViewActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
       
    }
}
