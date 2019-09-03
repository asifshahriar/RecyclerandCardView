package com.example.recyclerandcardview.others_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerandcardview.R;

public class Profile extends AppCompatActivity {

    private TextView nameText, descText, phone, details;
    private ImageView imageView, callImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //find id
        nameText = findViewById(R.id.textViewIdProfile);
        imageView = findViewById(R.id.drImageId);
        descText = findViewById(R.id.descId);
        details = findViewById(R.id.detailsId);
        phone = findViewById(R.id.numberId);
        callImage = findViewById(R.id.imageCallId);

        //get data
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){

            nameText.setText(bundle.getString("name"));
            imageView.setImageResource(bundle.getInt("images"));
            descText.setText(bundle.getString("desc"));
            details.setText(bundle.getString("details"));
            phone.setText(bundle.getString("phone"));
        }

        //cal action
        callImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mPhone = phone.getText().toString();
                mPhone = mPhone.replaceAll("[^0-9]","");
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+mPhone));
                startActivity(intent);
            }
        });

    }
}
