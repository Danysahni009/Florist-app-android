package com.android.tonyvu.sc.demo;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {
WebView w1;
    ImageButton m1,m2,m3,m4,m5,m6,m7,m8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));
        m1=(ImageButton)findViewById(R.id.b1);
        m2=(ImageButton)findViewById(R.id.b2);
        m3=(ImageButton)findViewById(R.id.b3);
        m4=(ImageButton)findViewById(R.id.b4);
        m5=(ImageButton)findViewById(R.id.b5);
        m6=(ImageButton)findViewById(R.id.b6);
        m7=(ImageButton)findViewById(R.id.b7);
        m8=(ImageButton)findViewById(R.id.b8);

        w1=(WebView)findViewById(R.id.web);

           }

//           w1.loadUrl(getIntent().getStringExtra("url"));
//        w1.setWebViewClient(new client());
//    class client extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            w1.loadUrl(url);
//            return true;
//        }
//    }


    public void calls (View view) {
        int id = view.getId();
        switch (id) {
            case R.id.b1:
                Intent rose = new Intent(getApplicationContext(), Rose.class);
                rose.putExtra("title", "Rose");
                startActivity(rose);
                break;

            case R.id.b2:
                Intent bougainvillea = new Intent(getApplicationContext(), Bougainvellia.class);
                bougainvillea.putExtra("title", "Bougainvillea");
                startActivity(bougainvillea);
                break;

            case R.id.b3:
                Intent Singaporedaisy = new Intent(getApplicationContext(), Singapore_daisy.class);
                Singaporedaisy.putExtra("title", "Singapore daisy");
                startActivity(Singaporedaisy);
                break;

            case R.id.b4:
                Intent Mogra = new Intent(getApplicationContext(), Mogra.class);
                Mogra.putExtra("title", "Mogra");
                startActivity(Mogra);
                break;

            case R.id.b5:
                Intent Meyeniaerecta = new Intent(getApplicationContext(), Meyenia_erecta.class);
                Meyeniaerecta.putExtra("title", "Meyenia Erecta");
                startActivity(Meyeniaerecta);
                break;

            case R.id.b6:
                Intent Lavendar = new Intent(getApplicationContext(), Lavendar.class);
                Lavendar.putExtra("title", "Lavendar");
                startActivity(Lavendar);
                break;

            case R.id.b7:
                Intent marigold = new Intent(getApplicationContext(), African_marigold.class);
                marigold.putExtra("title", "African Marigold");
                startActivity(marigold);
                break;

            case R.id.b8:
                Intent Sunflower = new Intent(getApplicationContext(), Sunflower_Minature.class);
                Sunflower.putExtra("title", "Sunflower Minature");
                startActivity(Sunflower);
                break;
        }
    }




    // w1.loadUrl(getIntent().getStringExtra("url"));
      //  w1.setWebViewClient(new client());



}
