package com.example.testbunner;

import android.content.Context;
import android.view.ViewGroup;

import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

public class BannerExampleAdapter extends BannerAdapter {

    public BannerExampleAdapter(List<DataBean> mDatas) {
        //设置数据，也可以调用banner提供的方法,或者自己在adapter中实现
        super(mDatas);
    }

    @Override
    public Object onCreateHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindView(Object holder, Object data, int position, int size) {

    }
}
