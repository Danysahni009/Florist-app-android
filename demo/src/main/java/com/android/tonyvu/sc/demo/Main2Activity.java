package com.android.tonyvu.sc.demo;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.android.tonyvu.sc.demo.model.CartItem;

public class Main2Activity extends AppCompatActivity {
 Button buy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().addFlags(WindowManager.LayoutParams.ALPHA_CHANGED);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.SCREEN_ORIENTATION_CHANGED);
        getSupportActionBar().hide();
        Intent move=new Intent(getApplicationContext(),one.class);
        buy=(Button)findViewById(R.id.buynow);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buys = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(buys);

            }
        });

    }
    public void call (View v) {
        int id = v.getId();
        switch (id) {
            case R.id.b1:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new one()).commit();
                break;

            case R.id.b2:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new two()).commit();
                break;

            case R.id.b3:
                getSupportFragmentManager().beginTransaction().add(R.id.replace, new three()).commit();
                break;
        }
    }
}
