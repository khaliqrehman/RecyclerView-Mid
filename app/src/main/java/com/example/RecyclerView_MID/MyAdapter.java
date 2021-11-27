package com.example.RecyclerView_MID;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] localDataSet;
    ImageView imageView;
    private int[] imageids;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;


        public ViewHolder(View view) {
            super(view);
            textView =  view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
        }

    }

    public MyAdapter(String[] dataSet, int[] imageids, Context context) {
        localDataSet = dataSet;
        this.imageids = imageids;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.singlerow, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder viewHolder, int position) {
        viewHolder.textView.setText(localDataSet[position]);
        viewHolder.imageView.setImageResource(imageids[position]);
      //  Bitmap bitmap;

        //viewHolder.getTextView().setText(imageid[position]);
    }

    @Override
    public int getItemCount()
    {
        return localDataSet.length;
    }
}