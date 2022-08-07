package com.android.tonyvu.sc.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.*;

public class Main3Activity extends AppCompatActivity {
ImageButton a1,a2,a3,a4,a5,a6,a7,a8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getWindow().addFlags(WindowManager.LayoutParams.ALPHA_CHANGED);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a1=(ImageButton)findViewById(R.id.i1);
        a2=(ImageButton)findViewById(R.id.i2);
        a3=(ImageButton)findViewById(R.id.i3);
        a4=(ImageButton)findViewById(R.id.i4);
        a5=(ImageButton)findViewById(R.id.i5);
        a6=(ImageButton)findViewById(R.id.i6);
        a7=(ImageButton)findViewById(R.id.i7);
        a8=(ImageButton)findViewById(R.id.i8);

    }
    public void call(View v)
    {
        int id=v.getId();
        switch (id)
        {
            case R.id.i1:
                Intent peacelily = new Intent(getApplicationContext(),Peace_lily.class);
                peacelily.putExtra("title", "Peace Lily");
                startActivity(peacelily);
                break;

            case R.id.i2:
                Intent gardenia = new Intent(getApplicationContext(),Gardenia_dwarf.class);
                gardenia.putExtra("title", "Gardenia Dwarf");
                startActivity(gardenia);
                break;

            case R.id.i3:
                Intent anthurium = new Intent(getApplicationContext(),Anthurium.class);
                anthurium.putExtra("title", "Anthurium");
                startActivity(anthurium);
                break;

            case R.id.i4:
                Intent andreanum = new Intent(getApplicationContext(),Anthurium_Andreanum.class);
                andreanum.putExtra("title", "Anthurium andreanum");
                startActivity(andreanum);
                break;

            case R.id.i5:
                Intent violet = new Intent(getApplicationContext(),African.class);
                violet.putExtra("title", "African Violet");
                startActivity(violet);
                break;

            case R.id.i6:
                Intent gloxinia = new Intent(getApplicationContext(),Gloxinia.class);
                gloxinia.putExtra("title", "Gloxinia");
                startActivity(gloxinia);
                break;

            case R.id.i7:
                Intent plume = new Intent(getApplicationContext(),Brazillian_plume.class);
                plume.putExtra("title", "Brazilian Plume");
                startActivity(plume);
                break;

            case R.id.i8:
                Intent silverdollar = new Intent(getApplicationContext(),Lunaria_Annua.class);
                silverdollar.putExtra("title", "Silver Dollar");
                startActivity(silverdollar);
                break;
        }
    }


}


