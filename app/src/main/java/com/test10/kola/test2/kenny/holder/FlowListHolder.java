package com.test10.kola.test2.kenny.holder;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayoutManager;
import com.test10.kola.test2.Card0_View_Adapter;
import com.test10.kola.test2.Card2_View_Adapter;
import com.test10.kola.test2.R;

import java.util.ArrayList;

/**
 * Created by Akano on 12/16/2017.
 */

public class FlowListHolder extends RecyclerView.ViewHolder {

    RecyclerView mIconViewHolder;

    public FlowListHolder(View itemView) {
        super(itemView);
        ArrayList<String> button_name = new ArrayList<>();
        button_name.add("CYCLING");
        button_name.add("BADMINTON");
        button_name.add("RACING");
        button_name.add("CRICKET");
        button_name.add("GYM");
        button_name.add("FOOTBALL");


        Card2_View_Adapter adapter = new Card2_View_Adapter(itemView.getContext(), button_name);

        mIconViewHolder = itemView.findViewById(R.id.flow_view_recycler_view);
        mIconViewHolder.setLayoutManager(new FlexboxLayoutManager(itemView.getContext()));
        mIconViewHolder.setAdapter(adapter);
    }

}
