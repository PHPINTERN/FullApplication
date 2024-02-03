package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class New_Regiration_Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_regiration_student);
    }

    public void Create_Student(View view) {
        Intent intent =  new Intent(getApplicationContext(), Create_Student1.class);
        startActivity(intent);
    }
}