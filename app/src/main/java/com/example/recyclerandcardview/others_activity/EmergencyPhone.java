package com.example.recyclerandcardview.others_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerandcardview.R;

public class EmergencyPhone extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_phone);

        button = findViewById(R.id.emergencyId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mPhone = button.getText().toString();
                mPhone = mPhone.replaceAll("[^0-9]","");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(""));
                startActivity(intent);
            }
        });
    }
}
