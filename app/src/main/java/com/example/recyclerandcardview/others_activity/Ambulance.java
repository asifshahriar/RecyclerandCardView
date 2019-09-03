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

import com.example.recyclerandcardview.R;
import com.example.recyclerandcardview.adapter.MyAdapter;

public class Ambulance extends AppCompatActivity {

    MyAdapter myAdapter;
    private int[] images = {R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance};
    private String[] ambulanceName, ambulanceDesc;
    private TextView desc;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerId);
        desc = findViewById(R.id.descId);

        ambulanceName = getResources().getStringArray(R.array.Ambulance_list);
        ambulanceDesc = getResources().getStringArray(R.array.Ambulance_desc);

        myAdapter = new MyAdapter(getApplicationContext(),images,ambulanceName,ambulanceDesc);
        recycler.setAdapter(myAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mPhone = desc.getText().toString();
                mPhone = mPhone.replaceAll("[^0-9]","");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+mPhone));
                startActivity(intent);
            }
        });
    }
}
