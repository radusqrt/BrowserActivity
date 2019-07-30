package com.radusqrt.android.browseractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, BrowserActivity.class);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.vogella.com/"));
        startActivity(intent);
    }
}
