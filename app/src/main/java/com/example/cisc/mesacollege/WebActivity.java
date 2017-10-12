package com.example.cisc.mesacollege;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by cisc on 10/12/2017.
 */

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView mesaWebView = (WebView) findViewById(R.id.webViewMesa);
        mesaWebView.loadUrl("https://www.sdmesa.edu");

    }
}
