package com.radusqrt.android.browseractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // To keep this example simple, we allow network access
        // in the user interface thread
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        setContentView(R.layout.activity_browser);
        Intent intent = getIntent();
        WebView webView = (WebView) findViewById(R.id.webView);

        // To get the action of the intent use
        String action = intent.getAction();
        if (!action.equals(Intent.ACTION_VIEW)) {
            throw new RuntimeException("Should not happen");
        }

        // To get the data use
        Uri data = intent.getData();
        webView.loadUrl(data.toString());
//        URL url = null;
//
//        try {
//            url = new URL(data.getScheme(), data.getHost(), data.getPath());
//            BufferedReader rd = new BufferedReader(new InputStreamReader(
//                    url.openStream()));
//            String line = "";
//            while ((line = rd.readLine()) != null) {
//                text.append(line);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}