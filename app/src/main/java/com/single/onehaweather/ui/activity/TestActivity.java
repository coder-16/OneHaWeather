package com.single.onehaweather.ui.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ListView;

import com.single.onehaweather.R;
import com.single.onehaweather.adapter.AppAdapter;
import com.single.onehaweather.data.bean.AppInstallInfo;
import com.single.onehaweather.ui.fragment.ListFragment;
import com.single.onehaweather.ui.fragment.ViewFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/3/14.
 */

public class TestActivity extends Activity {
    private FragmentManager mFragmentManager = null;
    private FragmentTransaction mFragmentTransaction = null;
    private Fragment mFragment = null;
    private Context mContext = null;
    private ListView mAppListView;
    private List<AppInstallInfo> apps;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("xiao", "into the onCreateView");
        setContentView(R.layout.activity_test);
        mContext = this;
//        mFragment = new ListFragment();
//        mFragmentManager = this.getFragmentManager();
//        mFragmentTransaction = mFragmentManager.beginTransaction();
//        mFragmentTransaction.add(R.id.fragment_container, mFragment);
//        mFragmentTransaction.commit();
        mAppListView = (ListView) findViewById(R.id.listView);
        apps = new ArrayList<>();
        apps.add(new AppInstallInfo(0, "11111111", "1111", false));
        apps.add(new AppInstallInfo(0, "2222222", "2222", false));
        apps.add(new AppInstallInfo(0, "3333333", "3333", false));
        AppAdapter mAppAdapter = new AppAdapter(mContext, apps);
        mAppListView.setAdapter(mAppAdapter);
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
