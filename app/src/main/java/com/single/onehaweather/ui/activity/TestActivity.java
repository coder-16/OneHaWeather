package com.single.onehaweather.ui.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.single.onehaweather.R;
import com.single.onehaweather.ui.fragment.ViewFragment;

/**
 * Created by lenovo on 2018/3/14.
 */

public class TestActivity extends Activity {
    private FragmentManager mFragmentManager = null;
    private FragmentTransaction mFragmentTransaction = null;
    private Fragment mFragment = null;
    private Context mContext = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("xiao", "into the onCreateView");
        setContentView(R.layout.activity_test);
        mContext = this;
        mFragment = new ViewFragment();
        mFragmentManager = this.getFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.fragment_container, mFragment);
        mFragmentTransaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
