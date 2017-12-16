package com.test10.kola.test2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Akano on 12/15/2017.
 */

public class Card2_View_Adapter extends RecyclerView.Adapter<Card2_View_Adapter.ViewHolder> {

    Context context;
    private List<String> button_name;

    private LayoutInflater mInflater;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView myTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            myTextView = (TextView) itemView.findViewById(R.id.tx12);

        }
    }

    public Card2_View_Adapter(Context context, List<String> button_name) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.button_name = button_name;
    }

    @Override
    public Card2_View_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.card2, parent, false);
        Card2_View_Adapter.ViewHolder viewHolder = new Card2_View_Adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Card2_View_Adapter.ViewHolder holder, int position) {

        holder.myTextView.setText(button_name.get(position));
    }

    @Override
    public int getItemCount() {
        return button_name.size();
    }

}