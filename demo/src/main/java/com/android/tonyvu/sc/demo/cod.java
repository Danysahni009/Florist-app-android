package com.android.tonyvu.sc.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cod extends AppCompatActivity {
Button cod;
EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cod);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);

        cod=(Button)findViewById(R.id.button);
        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please enter name",Toast.LENGTH_SHORT).show();
                }
                else if (e2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please enter address",Toast.LENGTH_SHORT).show();
                }
                else if (e3.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please enter contact details",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(cod.this, "Order Placed SUCCESSFULY", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(intent);
                }

                String editText = e1.getText().toString();
                String editText2 = e2.getText().toString();
                String editText3 = e3.getText().toString();
                SharedPreferences sp = getSharedPreferences("COD", MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();
                ed.putString("Name", editText);
                ed.putString("Address", editText2);
                ed.putString("Phone", editText3);
                ed.putInt("flag", 2);
                ed.commit();
                Log.d("submit", "order placed successfully");


            }

        });



        }
}
