package com.example.googlephotosclone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class imggridAdapter extends BaseAdapter {
    private final int[] images;
    public Context context;
    Intent in;

    public imggridAdapter(Context context, int[] images) {
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
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
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.singleimage, parent, false);
        ImageView img = (ImageView) view.findViewById(R.id.oneimage);
        img.setImageResource(images[i]);

        return view;
    }
}
