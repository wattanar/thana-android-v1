package com.kopkaap.thanashowtimes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by wattana on 22/12/2557.
 */
public class CustomAdapter extends BaseAdapter{

    Context mContext;
    String[] major;
    String[] pro;

    public CustomAdapter(Context context, String[] major,String[] pro) {
        this.mContext= context;
        this.major = major;
        this.pro = pro;
    }

    @Override
    public int getCount() {
        return major.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = mInflater.inflate(R.layout.item, null);

        TextView textView = (TextView)row.findViewById(R.id.title);
        textView.setText(major[i]);

       TextView textView2 = (TextView)row.findViewById(R.id.des);
        textView2.setText(pro[i]);

        return row;
    }
}
