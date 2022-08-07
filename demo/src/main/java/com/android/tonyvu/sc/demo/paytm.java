package com.android.tonyvu.sc.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class paytm extends AppCompatActivity {
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytm);
        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));
        w1=(WebView)findViewById(R.id.web);

        w1.loadUrl(getIntent().getStringExtra("url"));
        w1.setWebViewClient(new client());
    }

    class client extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            w1.loadUrl(url);
            return true;
        }

    }
}
