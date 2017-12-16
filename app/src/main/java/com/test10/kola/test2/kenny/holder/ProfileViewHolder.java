package com.test10.kola.test2.kenny.holder;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test10.kola.test2.R;

/**
 * Created by ribads on 12/16/17.
 */

public class ProfileViewHolder extends RecyclerView.ViewHolder {

    RecyclerView mIconViewHolder;

    public ProfileViewHolder(View itemView) {
        super(itemView);

        mIconViewHolder = itemView.findViewById(R.id.icon_recycler_view);
        mIconViewHolder.setLayoutManager(new GridLayoutManager(itemView.getContext(), 5));
        mIconViewHolder.setAdapter();
    }
}
