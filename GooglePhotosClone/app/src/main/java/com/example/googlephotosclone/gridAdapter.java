package com.example.googlephotosclone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.googlephotosclone.ui.photos.PhotosFragment;

public class gridAdapter extends BaseAdapter {
    private final int[] images;
    private final String title[];
    public Context context;
    Intent in;
    public gridAdapter(Context context, int[] images, String[] title){
        this.images=images;
        this.title=title;
        this.context=context;
    }
    @Override
    public int getCount() {
        return title.length;
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
       View view = LayoutInflater.from(context).inflate(R.layout.singlecard, parent, false);

        ImageView img=(ImageView)view.findViewById(R.id.iconimage);
        TextView b=(TextView)view.findViewById(R.id.title);

        //Button button=(Button)view.findViewById(R.id.button);
        img.setImageResource(images[i]);
//        if(title[i].length()>=13)
//        b.setText(title[i].substring(0,13)+"...");
//        else
            b.setText(title[i]);


        return view;
    }
}
