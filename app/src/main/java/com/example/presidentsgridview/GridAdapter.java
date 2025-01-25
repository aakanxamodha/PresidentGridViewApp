package com.example.presidentsgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private Integer[] presidentImages = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l
    };

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return presidentImages.length;
    }

    @Override
    public Object getItem(int position) {
        return presidentImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        imageView.setImageResource(presidentImages[position]);
        return convertView;
    }

    public int getImageId(int position) {
        return presidentImages[position];
    }
}