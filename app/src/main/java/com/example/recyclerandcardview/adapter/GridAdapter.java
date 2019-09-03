package com.example.recyclerandcardview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerandcardview.R;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] images;
    String[] specialist;
    private LayoutInflater inflater;

    public GridAdapter(Context context, int[] images, String[] specialist) {
        this.context = context;
        this.images = images;
        this.specialist = specialist;
    }

    @Override
    public int getCount() {
        return specialist.length;
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

        if(view == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_sample_view, viewGroup,false);
        }

        ImageView imageView = view.findViewById(R.id.gridImageViewId);
        TextView textView = view.findViewById(R.id.gridTextViewId);

        imageView.setImageResource(images[i]);
        textView.setText(specialist[i]);

        return view;
    }
}
