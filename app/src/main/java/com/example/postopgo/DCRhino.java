package com.example.postopgo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class DCRhino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcrhino);
        WebView view = (WebView)findViewById(R.id.fillableDC);
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadUrl("file:///android_asset/fillerhtml.html");
    }
}
