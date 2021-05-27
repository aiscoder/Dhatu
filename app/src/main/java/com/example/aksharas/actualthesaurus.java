package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class actualthesaurus extends AppCompatActivity {
    private WebView webview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualthesaurus);

        webview2 = (WebView) findViewById(R.id.webview2);
        WebSettings webSettings = webview2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview2.loadUrl("https://www.sanskrit-lexicon.uni-koeln.de/scans/AEScan/2020/web/webtc/indexcaller.php");
    }
}