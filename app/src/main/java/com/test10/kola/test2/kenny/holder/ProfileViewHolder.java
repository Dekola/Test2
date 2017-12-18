package com.test10.kola.test2.kenny.holder;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test10.kola.test2.Card0_View_Adapter;
import com.test10.kola.test2.R;

import java.util.ArrayList;

/**
 * Created by ribads on 12/16/17.
 */

public class ProfileViewHolder extends RecyclerView.ViewHolder {

    RecyclerView mIconViewHolder;

    public ProfileViewHolder(View itemView) {
        super(itemView);

        ArrayList<Integer> icons = new ArrayList<>();
        icons.add(R.mipmap.ex1);
        icons.add(R.mipmap.ex2);
        icons.add(R.mipmap.ex3);
        icons.add(R.mipmap.ex4);
        icons.add(R.mipmap.ex5);

        Card0_View_Adapter adapter = new Card0_View_Adapter(itemView.getContext(),icons);

        mIconViewHolder = itemView.findViewById(R.id.icon_recycler_view);
        mIconViewHolder.setLayoutManager(new GridLayoutManager(itemView.getContext(), 5));
        mIconViewHolder.setAdapter(adapter);
    }

}
