package com.example.yvtc.yvtc2017110901;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by yvtc on 2017/11/9.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    public MyAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText("Hello World:" + position);
        return tv;
    }
}
