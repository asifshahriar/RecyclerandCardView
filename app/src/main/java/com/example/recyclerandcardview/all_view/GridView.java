package com.example.recyclerandcardview.all_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.recyclerandcardview.doctor_activity.MainActivity;
import com.example.recyclerandcardview.R;
import com.example.recyclerandcardview.adapter.GridAdapter;

public class GridView extends AppCompatActivity {


    private android.widget.GridView gridView;
    private int[] images = {R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo,R.drawable.splash_logo};
    String[] specialist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        //find id
        gridView = findViewById(R.id.gridViewId);
        //get string
        specialist = getResources().getStringArray(R.array.Specialist_option);

        //adapter create
        GridAdapter gridAdapter = new GridAdapter(this,images,specialist);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent myIntent;

                if(i == 0){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 1){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 2){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 3){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 4){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 5){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 6){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 7){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 8){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 9){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 10){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 11){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 12){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 13){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 14){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 15){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 16){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 17){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 18){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 19){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 20){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 21){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 22){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 23){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 24){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 25){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 26){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 27){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 28){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 29){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 30){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 31){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 32){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 33){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 34){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 35){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 36){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 37){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }else if(i == 38){
                    myIntent = new Intent(GridView.this, MainActivity.class);
                    startActivity(myIntent);
                }

            }
        });
    }

}
