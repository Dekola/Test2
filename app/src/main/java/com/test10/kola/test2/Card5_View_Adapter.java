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
 * Created by Akano on 12/14/2017.
 */

public class Card5_View_Adapter extends RecyclerView.Adapter<Card5_View_Adapter.ViewHolder> {

    Context context;
    private List<String> comment_name;
    private List<String> comment_message;
    private List<Integer> comment_image;

    private LayoutInflater mInflater;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView comment_name_textView, comment_message_textView;

        public ImageView imagev;

        public ViewHolder(View itemView) {
            super(itemView);
            comment_name_textView = (TextView) itemView.findViewById(R.id.textView23);
            comment_message_textView = (TextView) itemView.findViewById(R.id.textView24);
            imagev = (ImageView) itemView.findViewById(R.id.imageView9);

        }
    }

    public Card5_View_Adapter(Context context, List<String> comment_name, List<String> comment_message, ArrayList<Integer> comment_image) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.comment_name = comment_name;
        this.comment_message = comment_message;
        this.comment_image = comment_image;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.card5, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.comment_name_textView.setText(comment_name.get(position));
        holder.comment_message_textView.setText(comment_message.get(position));

        Glide.with(context).load(comment_image.get(position))
                .thumbnail(1.0f)
                .bitmapTransform(new CircleTransform(context))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imagev);
    }

    @Override
    public int getItemCount() {
        return comment_name.size();
    }

}