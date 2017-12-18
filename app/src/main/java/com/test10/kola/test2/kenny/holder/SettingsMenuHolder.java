package com.test10.kola.test2.kenny.holder;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test10.kola.test2.Card0_View_Adapter;
import com.test10.kola.test2.Card4_View_Adapter;
import com.test10.kola.test2.R;

import java.util.ArrayList;

/**
 * Created by Akano on 12/16/2017.
 */

public class SettingsMenuHolder extends RecyclerView.ViewHolder {

    RecyclerView mIconViewHolder;

    public SettingsMenuHolder(View itemView) {
        super(itemView);

        ArrayList<String> comment_name = new ArrayList<>();
        comment_name.add("Gender");
        comment_name.add("Age");
        comment_name.add("Location");
        comment_name.add("Nationality");
        comment_name.add("FB Page");
        comment_name.add("Web");

        ArrayList<String> comment_message = new ArrayList<>();
        comment_message.add("Male");
        comment_message.add("24");
        comment_message.add("Geneva");
        comment_message.add("Swiss");
        comment_message.add("sam_jac@facebook.com");
        comment_message.add("www.spordy.com");


        Card4_View_Adapter adapter = new Card4_View_Adapter(itemView.getContext(), comment_name, comment_message);

        mIconViewHolder = itemView.findViewById(R.id.holder_settings_recycler_view);
        mIconViewHolder.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        mIconViewHolder.setAdapter(adapter);
    }

}
