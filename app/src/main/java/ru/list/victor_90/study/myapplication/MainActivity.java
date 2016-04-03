package ru.list.victor_90.study.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_flags).setOnClickListener(this);
        findViewById(R.id.btn_list).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()){
            case R.id.btn_flags :{
                intent = new Intent(MainActivity.this,ActivityFlags.class);
                break;
            }
            case R.id.btn_list :{
                intent = new Intent(MainActivity.this,ActivityList.class);
                break;
            }
        }

        startActivity(intent);

    }
}
