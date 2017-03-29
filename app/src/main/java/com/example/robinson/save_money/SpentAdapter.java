package com.example.robinson.save_money;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by robinson on 29/03/17.
 */

public class SpentAdapter extends RecyclerView.Adapter<SpentAdapter.NumberViewHolder> {

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        TextView listSpentNumberView;

        public NumberViewHolder(View itemView) {
            super(itemView);

            listSpentNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }
    }

}
