package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }


    public void Developer(View view) {
//        Toast.makeText(Main_Page.this, "Hello World", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),About.class);
        startActivity(intent);
    }
    public void Announcement(View view) {
        Intent intent = new Intent(getApplicationContext(), Announcement2.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(getApplicationContext(), Profile.class);
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(getApplicationContext(), Main_Page.class);
        startActivity(intent);
    }

    public void notes(View view) {
        Intent intent = new Intent(getApplicationContext(), Notes.class);
        startActivity(intent);
    }

    public void notcompleted(View view) {
        Toast  toast = new Toast(getApplicationContext());

    }
}