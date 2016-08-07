package com.example.administrator.viewpagertest1;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/8/7.
 */
public class MyPagerAdapter extends PagerAdapter {

    public List<View> mListviews;

    public MyPagerAdapter(List<View> mListview){
        this.mListviews = mListview;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return mListviews.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mListviews.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mListviews.get(position));
        return mListviews.get(position);
    }
}
