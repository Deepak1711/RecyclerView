package com.example.deepak.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DeepAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.drawerlist);
        adapter=new DeepAdapter(this,getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



    public static List<Information> getData(){
        List<Information> data=new ArrayList<>();
        String title[]={"deep","sharma"};
        int icon[]={R.drawable.anniversary,R.drawable.anniversary};
        for(int i=0;i<title.length && i<icon.length;i++)
        {
            Information current=new Information();
            current.title=title[i];
            current.iconId=icon[i];
            data.add(current);
        }
        return data;
    }
}
