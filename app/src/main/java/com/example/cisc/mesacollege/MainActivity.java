package com.example.cisc.mesacollege;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     Button buttonWebsite, buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWebsite = (Button) findViewById(R.id.buttonWebsite);
        buttonWebsite.setOnClickListener(this);

        buttonCall = (Button) findViewById(R.id.buttonCall);
        buttonCall.setOnClickListener(this);

    }

        @Override
        public void onClick(View v){

            switch (v.getId()) {
                case R.id.buttonWebsite:
                    Intent web;
                    web = new Intent(this, WebActivity.class);
                    startActivity(web);
                    break;

                case R.id.buttonCall:
                    Intent call;
                    call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel:619-388-2600"));
                    startActicity(call);
                    break;
            }
        }
}
