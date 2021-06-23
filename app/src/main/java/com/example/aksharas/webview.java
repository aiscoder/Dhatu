package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webview extends AppCompatActivity {
    private WebView webview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webview3 = (WebView) findViewById(R.id.webview3);
        WebSettings webSettings = webview3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview3.loadUrl("https://www.sanskritdictionary.com/");
    }
}