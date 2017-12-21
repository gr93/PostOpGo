package com.example.postopgo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toFAQ(View view)
    {
        Intent intent = new Intent(this, FaqRhino.class);
        startActivity(intent);
    }

    public void toDailyCare(View view)
    {
        Intent intent = new Intent(this, DCRhino.class);
        startActivity(intent);
    }

    public void toContact(View view)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"borpas@njms.rutgers.com"});
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(emailIntent, 0);
        boolean isIntentSafe = activities.size() > 0;

// Start an activity if it's safe
        if (isIntentSafe)
        {
            startActivity(emailIntent);
        }
    }

    public void toRestrictions(View view)
    {
        Intent intent = new Intent(this, RestRhino.class);
        startActivity(intent);
    }

    public void toMeds(View view)
    {
        Intent intent = new Intent(this, RhinoMeds.class);
        startActivity(intent);
    }
}

