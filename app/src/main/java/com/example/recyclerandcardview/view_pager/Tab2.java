package com.example.recyclerandcardview.view_pager;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.example.recyclerandcardview.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment implements View.OnClickListener {


    public Tab2() {
        // Required empty public constructor
    }

    private Button button1, button2, button3, button4, button5, button6,button7, button8;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        //find webView layout

        //find id
        button1 = view.findViewById(R.id.buttonId1);
        button2 = view.findViewById(R.id.buttonId2);
        button3 = view.findViewById(R.id.buttonId3);
        button4 = view.findViewById(R.id.buttonId4);
        button5 = view.findViewById(R.id.buttonId5);
        button6 = view.findViewById(R.id.buttonId6);
        button7 = view.findViewById(R.id.buttonId7);
        button8 = view.findViewById(R.id.buttonId8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.buttonId1){


        }
    }
}
