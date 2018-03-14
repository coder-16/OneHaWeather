package com.single.onehaweather.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.single.onehaweather.R;

/**
 * Created by lenovo on 2018/3/14.
 */

public class ViewFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_fragment, container, false);
        Log.w("xiao", "into the onCreateView");
        return view;
    }
}
