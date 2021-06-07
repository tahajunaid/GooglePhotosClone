package com.example.googlephotosclone.ui.photos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.googlephotosclone.MainActivity;
import com.example.googlephotosclone.MessageActivity;
import com.example.googlephotosclone.R;
import com.example.googlephotosclone.gridAdapter;
import com.example.googlephotosclone.imggridAdapter;

public class PhotosFragment extends Fragment {

    int cardimgs[] = {R.drawable.i4, R.drawable.spotlight, R.drawable.magichour, R.drawable.yearago};
    String cardtitle[] = {"Recent    highlights", "Spotlight on    Taha Junaid", "The magic hour", "1 year ago"};
    int images[] = {R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5,
            R.drawable.i6, R.drawable.i7, R.drawable.i8, R.drawable.i9, R.drawable.i10,
            R.drawable.i11, R.drawable.i12, R.drawable.i13, R.drawable.i14, R.drawable.i15,
            R.drawable.i17, R.drawable.i18};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_photos, container, false);
        MainActivity mac = new MainActivity();
        GridView grid;
        grid = (GridView) root.findViewById(R.id.datagrid);
        gridAdapter obj = new gridAdapter(this.getContext(), cardimgs, cardtitle);
        grid.setAdapter(obj);
//Images grid 1
        GridView grid2;
        grid2 = (GridView) root.findViewById(R.id.imggrid);
        imggridAdapter obj2 = new imggridAdapter(this.getContext(), images);
        grid2.setAdapter(obj2);

        //Images grid 1
        GridView grid3;
        grid3 = (GridView) root.findViewById(R.id.imggrid2);
        imggridAdapter obj3 = new imggridAdapter(this.getContext(), images);
        grid3.setAdapter(obj3);

        CardView imgv=root.findViewById(R.id.msg_icon);
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(root.getContext(), MessageActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
