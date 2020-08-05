package com.example.testbunner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.transformer.AlphaPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner = (Banner) findViewById(R.id.banner);
        //--------------------------简单使用-------------------------------
       /*banner.addBannerLifecycleObserver(this)//添加生命周期观察者
                .setAdapter(new BannerImageAdapter<DataBean>(DataBean.getTestData()) {
                    @Override
                    public void onBindView(BannerImageHolder holder, DataBean data, int position, int size) {
                        //图片加载自己实现
                        Glide.with(holder.itemView)
                                .load(data.imageUrl)
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                                .into(holder.imageView);
                    }
                })
                .setIndicator(new CircleIndicator(this));*/

        //—————————————————————————如果你想偷懒，而又只是图片轮播————————————————————————

       banner.setAdapter(new ImageAdapter(DataBean.getTestData()) {

        })
                .addBannerLifecycleObserver(this)//添加生命周期观察者
                .setIndicator(new CircleIndicator(this))
               //设置画廊效果
                .setBannerGalleryEffect(300,3).addPageTransformer(new AlphaPageTransformer());


        //更多使用方法仔细阅读文档，或者查看demo
    }
}