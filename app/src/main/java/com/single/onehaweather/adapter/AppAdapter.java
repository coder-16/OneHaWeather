package com.single.onehaweather.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.single.onehaweather.R;
import com.single.onehaweather.data.bean.AppInstallInfo;

import java.util.List;

/**
 * Created by lenovo on 2018/3/15.
 */

public class AppAdapter extends BaseAdapter {
    private List<AppInstallInfo> appList;
    private LayoutInflater mInflater;

    public AppAdapter(Context context, List<AppInstallInfo> list) {
        appList = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return appList.size();
    }

    @Override
    public Object getItem(int position) {
        return appList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {// View未被实例化，即缓冲池中无缓存才创建View
            // 将控件id保存在viewHolder中
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_listview, null);
            viewHolder.mAppName = (TextView) convertView.findViewById(R.id.tv_app_name);
            viewHolder.mAppSummary = (TextView) convertView.findViewById(R.id.tv_app_summary);
            // 通过setTag将ViewHolder与convertView绑定
            AppInstallInfo bean = appList.get(position);
            viewHolder.mAppName.setText(bean.getmAppName());
            viewHolder.mAppSummary.setText(bean.getmAppSummary());
            convertView.setTag(viewHolder);
        } else {
            // 通过ViewHolder对象找到对应控件
            viewHolder = (ViewHolder) convertView.getTag();
            AppInstallInfo bean = appList.get(position);
            viewHolder.mAppName.setText(bean.getmAppName());
            viewHolder.mAppSummary.setText(bean.getmAppSummary());
        }
        return convertView;
    }

    class ViewHolder {
        public ImageView mImageViwe;
        public TextView mAppName;
        public TextView mAppSummary;
    }

}
