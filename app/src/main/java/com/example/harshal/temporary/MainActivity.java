package com.example.harshal.temporary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  Adapter_itemInactivities recycleview_adapter;
    private static List<Dataset> data = new ArrayList<Dataset>();
    Button add_list,doneediting;
    EditText data_decription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recycleview_adapter = new Adapter_itemInactivities(getApplicationContext(),getData());

        add_list = (Button) findViewById(R.id.addbutton);
        doneediting = (Button) findViewById(R.id.Done);
        data_decription = (EditText) findViewById(R.id.newactivity);

        recyclerView.setAdapter(recycleview_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Log.e("////////////////","Set adapter");






        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = String.valueOf(data_decription.getText());
                if(!temp.equals(""))
                    data.add(new Dataset(temp));
                recycleview_adapter.notifyDataSetChanged();
                data_decription.setText("");
            }
        });

    }
    public static List<Dataset> getData()
    {
        data.add(new Dataset("Harshal"));
        data.add(new Dataset("Piyush"));
        data.add(new Dataset("Rajan"));
        data.add(new Dataset("Unknown"));
        data.add(new Dataset("Harshal"));
        data.add(new Dataset("Piyush"));
        data.add(new Dataset("Rajan"));
        data.add(new Dataset("Unknown"));

        return data;
    }


}
