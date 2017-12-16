package com.test10.kola.test2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akano on 12/15/2017.
 */

class Card0_View_Adapter extends RecyclerView.Adapter<Card0_View_Adapter.ViewHolder> {

    Context context;
    private List<Integer> icon;

    private LayoutInflater mInflater;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imagev;

        public ViewHolder(View itemView) {
            super(itemView);
            imagev = (ImageView) itemView.findViewById(R.id.icon_view);
        }
    }

    public Card0_View_Adapter(Context context,ArrayList<Integer> icon) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.icon = icon;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.icon_layout, parent, false);
        Card0_View_Adapter.ViewHolder viewHolder = new Card0_View_Adapter.ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(Card0_View_Adapter.ViewHolder holder, int position) {

        Glide.with(context).load(icon.get(position))
                .thumbnail(1.0f)
                .bitmapTransform(new CircleTransform(context))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imagev);
    }

    @Override
    public int getItemCount() {
        return icon.size();
    }

}