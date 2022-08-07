package com.android.tonyvu.sc.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class Main5Activity extends AppCompatActivity {
ImageButton n1,n2,n3,n4,n5,n6,n7,n8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getWindow().addFlags(WindowManager.LayoutParams.ALPHA_CHANGED);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        n1=(ImageButton)findViewById(R.id.c1);
        n2=(ImageButton)findViewById(R.id.c2);
        n3=(ImageButton)findViewById(R.id.c3);
        n4=(ImageButton)findViewById(R.id.c4);
        n5=(ImageButton)findViewById(R.id.c5);
        n6=(ImageButton)findViewById(R.id.c6);
        n7=(ImageButton)findViewById(R.id.c7);
        n8=(ImageButton)findViewById(R.id.c8);

    }

    public void Call (View views)
    {
        int id=views.getId();
        switch (id)
        {
            case R.id.c1:
                Intent wallbush = new Intent(getApplicationContext(),Artificial_1.class);
                wallbush.putExtra("title", "Yellow plastic artificial wall bush");
                startActivity(wallbush);
                break;

            case R.id.c2:
                Intent asterbush = new Intent(getApplicationContext(),Artificial_2.class);
                asterbush.putExtra("title", "Artificial Aster Bush");
                startActivity(asterbush);
                break;

            case R.id.c3:
                Intent poinsettia = new Intent(getApplicationContext(),Artificial_3.class);
                poinsettia.putExtra("title", "Poinsettia");
                startActivity(poinsettia);
                break;

            case R.id.c4:
                Intent bougainvilleabasket = new Intent(getApplicationContext(),Artificial_4.class);
                bougainvilleabasket.putExtra("title", "Synthetic tall bougainvillea hanging basket");
                startActivity(bougainvilleabasket);
                break;

            case R.id.c5:
                Intent crysanthemum = new Intent(getApplicationContext(),Artificiaql_5.class);
                crysanthemum.putExtra("title", "Silk Artificial Chrysanthemum Flowers");
                startActivity(crysanthemum);
                break;

            case R.id.c6:
                Intent peach = new Intent(getApplicationContext(),Artificial_6.class);
                peach.putExtra("title", "Artificial Peach Blossom Flower");
                startActivity(peach);
                break;

            case R.id.c7:
                Intent bonsai = new Intent(getApplicationContext(),Artificial_7.class);
                bonsai.putExtra("title", "Hyperboles Artificial Pine Bonsai");
                startActivity(bonsai);
                break;

            case R.id.c8:
                Intent artimarigold = new Intent(getApplicationContext(),Artificial_8.class);
                artimarigold.putExtra("title", "Artificial Marigold Fluffy Flowers Garlands");
                startActivity(artimarigold);
                break;
        }
    }
}
