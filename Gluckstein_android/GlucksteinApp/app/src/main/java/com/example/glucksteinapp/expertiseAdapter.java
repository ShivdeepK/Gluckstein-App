package com.example.glucksteinapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class expertiseAdapter extends BaseAdapter {
    private final Context mContext;
    private final Experts[] experts;

    // 1
    public expertiseAdapter(Context context, Experts[] experts) {
        this.mContext = context;
        this.experts = experts;
    }

    // 2
    @Override
    public int getCount() {
        return experts.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Experts expert = experts[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_experts, null);
        }

        // 3
        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imgView_image);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.txtView_name);

        // 4
        imageView.setImageResource(expert.getImageResource());
        nameTextView.setText(expert.getName());

        return convertView;
    }

}


