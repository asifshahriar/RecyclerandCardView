package com.example.recyclerandcardview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerandcardview.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private static ClickListener clickListener;
    Context context;
    int[] images;
    String[] mediDrName, mediDrDesc;

    public MyAdapter(Context context, int[] images, String[] mediDrName, String[] mediDrDesc) {
        this.context = context;
        this.images = images;
        this.mediDrName = mediDrName;
        this.mediDrDesc = mediDrDesc;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_sample, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.images.setImageResource(images[position]);
        holder.text1.setText(mediDrName[position]);
        holder.text2.setText(mediDrDesc[position]);
    }

    @Override
    public int getItemCount() {
        return mediDrName.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView images;
        TextView text1, text2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            images = itemView.findViewById(R.id.imageViewId);
            text1 = itemView.findViewById(R.id.nameId);
            text2 = itemView.findViewById(R.id.descId);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getAdapterPosition(),view);
        }
    }

    public interface ClickListener{
        void onItemClick(int position, View v);
    }
    public void setOnItemClickListener(ClickListener clickListener){
        MyAdapter.clickListener = clickListener;
    }

}


