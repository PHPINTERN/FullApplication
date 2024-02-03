package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Show_Notes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_notes);
        WebView  webView= findViewById(R.id.web);
        webView.loadUrl("https://drive.google.com/file/d/1sStnZI1KwXNa_lttTI3rXmxvSLGm6shL/view?usp=sharing");
    }
}