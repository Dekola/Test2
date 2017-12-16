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

public class Card4_View_Adapter extends RecyclerView.Adapter<Card4_View_Adapter.ViewHolder> {

    Context context;
    private List<String> comment_name;
    private List<String> comment_message;

    private LayoutInflater mInflater;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView myTextView, textView;

        public ViewHolder(View itemView) {
            super(itemView);
            myTextView = (TextView) itemView.findViewById(R.id.textView8);
            textView = (TextView) itemView.findViewById(R.id.textView14);

        }
    }

    public Card4_View_Adapter(Context context, List<String> comment_name, List<String> comment_message) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.comment_name = comment_name;
        this.comment_message = comment_message;
    }

    @Override
    public Card4_View_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.card4, parent, false);
        Card4_View_Adapter.ViewHolder viewHolder = new Card4_View_Adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Card4_View_Adapter.ViewHolder holder, int position) {

        holder.myTextView.setText(comment_name.get(position));
        holder.textView.setText(comment_message.get(position));
    }

    @Override
    public int getItemCount() {
        return comment_name.size();
    }

}