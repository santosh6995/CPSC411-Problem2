package com.example.problem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

        Integer[] items = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Integer[] items1 = {1,2,3,4,5};
        ArrayAdapter<Integer> adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            ListView lv = (ListView) findViewById(R.id.lv);

            adapter = new ArrayAdapter<Integer>(this,
                    R.layout.list_item1, items);

            lv.setAdapter(adapter);


            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position,
                                        long id) {


                    Log.d("vt","cliceked on  "+items[position]);
                    items[position] = items[position] +1;

                    adapter.notifyDataSetChanged();
                }
            });
        }
    }

