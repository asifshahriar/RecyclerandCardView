package com.example.recyclerandcardview.doctor_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recyclerandcardview.R;
import com.example.recyclerandcardview.adapter.MyAdapter;
import com.example.recyclerandcardview.others_activity.Profile;

public class Gynecology extends AppCompatActivity {

    MyAdapter myAdapter;
    int[] images = {R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo};
    String[] DrName, DrDesc, phone, details;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recyclerId);

        DrName = getResources().getStringArray(R.array.Gynecology_name);
        DrDesc = getResources().getStringArray(R.array.Gynecology_desc);
        details = getResources().getStringArray(R.array.Gynecology_details);
        phone = getResources().getStringArray(R.array.Gynecology_Phone);

        myAdapter = new MyAdapter(getApplicationContext(), images, DrName, DrDesc);
        recycler.setAdapter(myAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int i, View v) {

                Intent intent = new Intent(Gynecology.this, Profile.class);
                intent.putExtra("name", DrName[i]);
                intent.putExtra("images",images[i]);
                intent.putExtra("desc",DrDesc[i]);
                intent.putExtra("details",details[i]);
                intent.putExtra("phone",phone[i]);
                startActivity(intent);
            }
        });
    }
}
