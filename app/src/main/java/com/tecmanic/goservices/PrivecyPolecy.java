package com.tecmanic.goservices;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PrivecyPolecy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privecy_polecy);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://qrmenu.co.in/salonapp/files/Privacypolices");

    }

}