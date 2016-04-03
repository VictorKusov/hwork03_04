package ru.list.victor_90.study.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityList extends Activity {

    ListView listView;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>(1000);
        for(int i=0; i<1000; i++){
            list.add("item " + i);
        }

        MyAdapter adapter = new MyAdapter(ActivityList.this, list);

        listView.setAdapter(adapter);
    }
}
