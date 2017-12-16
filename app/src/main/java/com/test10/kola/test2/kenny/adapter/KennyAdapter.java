package com.test10.kola.test2.kenny.adapter;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test10.kola.test2.R;
import com.test10.kola.test2.kenny.holder.ProfileViewHolder;
import com.test10.kola.test2.kenny.holder.TitleDetailsHolder;

/**
 * Created by ribads on 12/16/17.
 */

public class KennyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int PROFILE_AREA_VIEW_TYPE = 0;
    private static final int TITLE_DETAILS_VIEW_TYPE = 1;
    private static final int FLOW_LIST_VIEW_TYPE = 2;
    private static final int SETTINGS_MENU_VIEW_TYPE = 3;
    private static final int COMMENT_VIEW_TYPE = 4;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int layoutRes = getLayoutRes(viewType);
        View view = LayoutInflater.from(parent.getContext()).inflate(layoutRes, parent, false);
        if (viewType == PROFILE_AREA_VIEW_TYPE){
            return new ProfileViewHolder(view);
        }
        else if (viewType == TITLE_DETAILS_VIEW_TYPE){
            return new TitleDetailsHolder(view);
        }
    }

    private @LayoutRes int getLayoutRes(int viewType) {

        switch (viewType){
            case PROFILE_AREA_VIEW_TYPE:
                return R.layout.holder_profile;
            case TITLE_DETAILS_VIEW_TYPE:
                return R.layout.holder_title_details;
            case FLOW_LIST_VIEW_TYPE:
                return R.layout.holder_flow_list;
        }
    }

    @Override
    public int getItemViewType(int position) {

        switch (position){
            case 0:
                return PROFILE_AREA_VIEW_TYPE;
            case 1:
                return TITLE_DETAILS_VIEW_TYPE;
            case 2:
                return FLOW_LIST_VIEW_TYPE;
            case 3:
                return TITLE_DETAILS_VIEW_TYPE;
            case 4:
                return SETTINGS_MENU_VIEW_TYPE;
            case 5:
                return COMMENT_VIEW_TYPE;

        }

        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        if (position == 1){
            TitleDetailsHolder holder1 = (TitleDetailsHolder) holder;
            ((TitleDetailsHolder) holder).initData("Training Expersience", "jcg cgucys gd");
        }

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
