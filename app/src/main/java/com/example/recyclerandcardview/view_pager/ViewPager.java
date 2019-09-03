package com.example.recyclerandcardview.view_pager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

import com.example.recyclerandcardview.R;
import com.google.android.material.tabs.TabLayout;

public class ViewPager extends AppCompatActivity {

    private TabLayout tabLayout;
    private androidx.viewpager.widget.ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }
    class MyPagerAdapter extends FragmentPagerAdapter {


        String[] text = {"জরুরী সার্ভিস","স্বাস্থ বিষয়ক তথ্য"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if(position == 0){
                return new Tab1();
            }if(position == 1){
                return new Tab2();
            }

            return null;
        }

        @Override
        public int getCount() {
            return text.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return text[position];
        }
    }
}

