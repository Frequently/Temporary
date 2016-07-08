package com.example.harshal.temporary;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Harshal on 23-06-2016.
 */
public class Activities_adapter extends ArrayAdapter<String> {


    Context context;
    List<String> myList;

    // Context con = getContext();

    public Activities_adapter(Context context, int resource, List<String> myList) {
        super(context, resource, myList);

        this.context = context;
        this.myList = myList;

    }

    @Override
    public int getCount() {
        return 0;
    }



    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_row, parent, false);



        Log.e("////////////////","In the adapter");
//
//        TextView textView = (TextView) view.findViewById(R.id.activity);
//        textView.setText(myList.get(position));
//
//        Log.e("////////////////",""+myList.get(position));
//
//        Toast.makeText(getContext(),"Hi",Toast.LENGTH_SHORT).show();
        return view;
    }
}
