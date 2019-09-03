package com.example.recyclerandcardview.others_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.recyclerandcardview.R;

public class HospitalListView extends AppCompatActivity {

    private ListView listView;
    String[] clinicName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list_view);

        listView = findViewById(R.id.clinicListId);

        clinicName = getResources().getStringArray(R.array.hospital_List);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(HospitalListView.this,R.layout.listview_sample,R.id.allListId,clinicName);
        listView.setAdapter(myAdapter);

    }
}
