package com.example.postopgo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SinusMeds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinus_meds);
        WebView view = (WebView)findViewById(R.id.fillableMedsSin);
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadUrl("file:///android_asset/fillerhtml.html");
    }
}
