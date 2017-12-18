package com.test10.kola.test2.kenny.holder;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.test10.kola.test2.Card0_View_Adapter;
import com.test10.kola.test2.Card5_View_Adapter;
import com.test10.kola.test2.R;

import java.util.ArrayList;

/**
 * Created by Akano on 12/16/2017.
 */

public class CommentViewHolder extends RecyclerView.ViewHolder {

    RecyclerView mIconViewHolder;
    public CommentViewHolder(View itemView) {
        super(itemView);

        ArrayList<String> comment_name = new ArrayList<>();
        comment_name.add("Gabriela Becker");
        comment_name.add("James Richardson");
        comment_name.add("Steve Patrick");

        ArrayList<String> comment_message = new ArrayList<>();
        comment_message.add("Jackson is a lovely and honest trainer. If away from home too easy to loose. After the training or pay more attention");
        comment_message.add("Awesome!!! Really Nice");
        comment_message.add("Good Training");

        ArrayList<Integer> covers = new ArrayList<>();
        covers.add(R.drawable.pic_1);
        covers.add(R.drawable.pic_2);
        covers.add(R.drawable.pic_3);

        Card5_View_Adapter adapter = new Card5_View_Adapter(itemView.getContext(), comment_name, comment_message, covers);

        mIconViewHolder = itemView.findViewById(R.id.holder_comment_recycler_view);
        mIconViewHolder.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        mIconViewHolder.setAdapter(adapter);
    }

}
