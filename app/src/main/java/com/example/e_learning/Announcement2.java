package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Announcement2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement2);
    }

    public void home(View view) {
        Intent intent = new Intent(getApplicationContext(), Main_Page.class);
        startActivity(intent);
    }

    public void notcompleted(View view) {
        Toast.makeText(Announcement2.this,"NOT COMPLETED",Toast.LENGTH_SHORT).show();
    }
}