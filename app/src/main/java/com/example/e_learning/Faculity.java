package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Faculity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculity);
    }
    public void home(View view) {
        Intent intent = new Intent(getApplicationContext(), Main_Page.class);
        startActivity(intent);
    }
}