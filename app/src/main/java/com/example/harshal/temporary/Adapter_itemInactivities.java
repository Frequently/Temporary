package com.example.harshal.temporary;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.Collections;
import java.util.List;

/**
 * Created by Harshal on 08-07-2016.
 */
public class Adapter_itemInactivities extends RecyclerView.Adapter<Adapter_itemInactivities.MyviewHolder>  {

    private LayoutInflater inflator;
    private List<Dataset> datasetList = Collections.emptyList();
    private Context context;

    public Adapter_itemInactivities(Context context,List<Dataset> list)
    {
        this.context = context;
        inflator = LayoutInflater.from(context);
        datasetList = list;

    }

    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflator.inflate(R.layout.custom_row,parent,false);

        MyviewHolder myviewHolder = new MyviewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, int position) {
        Dataset dataset = datasetList.get(position);
        holder.checkBox.setText(dataset.name);
        holder.checkBox.setTextColor(Color.BLACK);

    }

    @Override
    public int getItemCount() {
        return datasetList.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        CheckBox checkBox;
        public MyviewHolder(View itemView) {
            super(itemView);

            checkBox = (CheckBox) itemView.findViewById(R.id.checkBox);

        }

        @Override
        public void onClick(View v) {
            checkBox.toggle();
        }
    }
}
