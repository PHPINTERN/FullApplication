package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void faculity_list(View view) {
        Intent intent = new Intent(getApplicationContext(), Faculity.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(getApplicationContext(), Main_Page.class);
        startActivity(intent);
    }

    public void attendance(View view) {
        Toast.makeText(Profile.this,"STUDENT ATTENDANCE : 90%",Toast.LENGTH_SHORT).show();
    }
}