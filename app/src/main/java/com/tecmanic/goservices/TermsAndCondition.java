package com.tecmanic.goservices;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TermsAndCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://qrmenu.co.in/salonapp/files/termandcondition");



    }
}