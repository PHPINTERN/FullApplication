package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
    }

    public void co1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1sStnZI1KwXNa_lttTI3rXmxvSLGm6shL/view?usp=sharing"));
        startActivity(intent);
    }
    public void ClassNotes(View view) {
        Intent intent = new Intent(getApplicationContext(),Class_Notes.class);
        startActivity(intent);
    }
}