package com.example.recyclerandcardview.others_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.recyclerandcardview.R;

public class Diagnostic extends AppCompatActivity {

    ListView listView;
    String[] diagnosticList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic);

        listView = findViewById(R.id.diagnosticId);

        diagnosticList = getResources().getStringArray(R.array.diagnostic_list);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(Diagnostic.this,R.layout.listview_sample,R.id.allListId,diagnosticList);
        listView.setAdapter(myAdapter);
    }
}
