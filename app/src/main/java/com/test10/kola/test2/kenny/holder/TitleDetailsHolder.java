package com.test10.kola.test2.kenny.holder;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ribads on 12/16/17.
 */

public class TitleDetailsHolder extends ViewHolder {

    TextView mTitleTextView;
    TextView mDetailsTextView;


    public TitleDetailsHolder(View view) {
        super(view);
    }

    public void initData(String title, String details){
        mTitleTextView.setText(title);
        mDetailsTextView.setText(details);
    }

}
