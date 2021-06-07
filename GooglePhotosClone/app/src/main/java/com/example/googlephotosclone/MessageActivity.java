package com.example.googlephotosclone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MessageActivity extends AppCompatActivity {
    int images1[] = {R.drawable.a,R.drawable.m};
    String name[] = {"Azhar","Manoj"};
    int images2[] = {R.drawable.i5,R.drawable.i8};
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ImageButton back = findViewById(R.id.backicon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        lv = findViewById(R.id.listview);
        lv.setAdapter(new myAdapter(this));

        ExtendedFloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(fab, "Create New Album", Snackbar.LENGTH_LONG).show();
            }
        });

    }

    private class myAdapter extends BaseAdapter {

        Context mycontext;

        public myAdapter(MessageActivity mainActivity) {
            mycontext = mainActivity;
        }

        @Override
        public int getCount() {
            return name.length;
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
            View view = LayoutInflater.from(mycontext).inflate(R.layout.items, parent, false);
            ImageView iv1 = view.findViewById(R.id.iv1);
            TextView t = view.findViewById(R.id.t);
            ImageView iv2 = view.findViewById(R.id.iv2);

            iv1.setImageResource(images1[position]);
            t.setText(name[position]);
            iv2.setImageResource(images2[position]);

            return view;
        }
    }
}


