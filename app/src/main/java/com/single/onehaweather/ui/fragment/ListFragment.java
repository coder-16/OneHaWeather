package com.single.onehaweather.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.single.onehaweather.R;
import com.single.onehaweather.adapter.AppAdapter;
import com.single.onehaweather.data.bean.AppInstallInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/3/15.
 */

public class ListFragment extends Fragment {
    private ListView mAppListView;
    private List<AppInstallInfo> apps;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listview, container);
        mAppListView = (ListView) view.findViewById(R.id.listView);
        apps=new ArrayList<>();
        apps.add(new AppInstallInfo(0, "11111111", "1111", false));
        apps.add(new AppInstallInfo(0, "2222222", "2222", false));
        apps.add(new AppInstallInfo(0, "3333333", "3333", false));
        AppAdapter mAppAdapter = new AppAdapter(getActivity(), apps);
        mAppListView.setAdapter(mAppAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
