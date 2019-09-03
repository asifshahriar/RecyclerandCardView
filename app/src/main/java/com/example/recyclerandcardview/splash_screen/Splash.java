package com.example.recyclerandcardview.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerandcardview.R;
import com.example.recyclerandcardview.view_pager.ViewPager;

public class Splash extends AppCompatActivity {

    private static int splashTimeOut = 3000;
    private ImageView splashImageView;
    private TextView splashTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashImageView = findViewById(R.id.splashImageId);
        splashTextView = findViewById(R.id.splasTextViewId);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, ViewPager.class);
                startActivity(intent);
                finish();
            }
        },splashTimeOut);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        splashImageView.startAnimation(myanim);
        splashTextView.startAnimation(myanim);
    }
}
