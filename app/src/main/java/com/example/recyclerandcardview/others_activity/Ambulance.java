package com.example.recyclerandcardview.others_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerandcardview.R;
import com.example.recyclerandcardview.adapter.MyAdapter;

public class Ambulance extends AppCompatActivity {

    MyAdapter myAdapter;
    private int[] images = {R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance};
    private String[] ambulanceName, ambulanceDesc;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerId);

        ambulanceName = getResources().getStringArray(R.array.Ambulance_list);
        ambulanceDesc = getResources().getStringArray(R.array.Ambulance_desc);

        myAdapter = new MyAdapter(getApplicationContext(),images,ambulanceName,ambulanceDesc);
        recycler.setAdapter(myAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Intent intent = new Intent(Ambulance.this,AmbulanceCall.class);
                startActivity(intent);
            }
        });
    }
}
