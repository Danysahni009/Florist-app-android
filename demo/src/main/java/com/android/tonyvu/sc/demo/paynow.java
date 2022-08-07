package com.android.tonyvu.sc.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paynow extends AppCompatActivity {
    Button a1,a2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paynow);
        a1=(Button)findViewById(R.id.b1);
        a2=(Button)findViewById(R.id.b2);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cod = new Intent(getApplicationContext(),cod.class);
                startActivity(cod);

            }
        });
    }

    public void calls (View v3)
    {
        int id=v3.getId();
        switch (id) {
            case R.id.b2:
                Intent paytm = new Intent(getApplicationContext(), paytm.class);
                paytm.putExtra("url", "http://www.paytm.com");
                paytm.putExtra("title", "Paytm");
                startActivity(paytm);
        }

    }
}
