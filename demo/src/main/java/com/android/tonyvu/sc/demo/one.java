package com.android.tonyvu.sc.demo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


public class one extends Fragment {
Button b1;

    public one() {
        // Required empty public constructor

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_one,container,false);

        Button b1=(Button)v.findViewById(R.id.b1);
       b1.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent move=new Intent(getActivity(),Main3Activity.class);
               startActivity(move);
           }
       });
       return v;
    }


//    public void setContentView(int contentView) {
//        this.contentView = contentView;
//    }
}
