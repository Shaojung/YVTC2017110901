package com.example.yvtc.yvtc2017110901;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yvtc on 2017/11/9.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    String str[];
    public MyAdapter(Context context, String[] str)
    {
        this.context = context;
        this.str = str;
    }

    @Override
    public int getCount() {
        return str.length;
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
    public View getView(int position, final View convertView, ViewGroup parent) {
        Log.d("GETVIEW", "position:" + position);
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        Button btn = (Button) v.findViewById(R.id.button);
        final String msg = str[position];
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
            }
        });
        tv.setText(str[position]);
        return v;
    }
}
