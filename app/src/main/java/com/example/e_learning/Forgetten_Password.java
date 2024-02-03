package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Forgetten_Password extends AppCompatActivity {

    EditText E1;
    TextView T1,T2,T3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetten_password);
    }

    public void Forgetten_password(View view) {
        E1 = findViewById(R.id.Regristation);
        E1.equals(null);
        T1 =findViewById(R.id.RequestingTest);
        T1.setVisibility(View.INVISIBLE);
        T2 =findViewById(R.id.subbmit_Button);
        T3= findViewById(R.id.message);
        T3.setVisibility(View.VISIBLE);
        T3.setText("LINK SENT");
        T2.setVisibility(View.INVISIBLE);
        E1.setVisibility(View.INVISIBLE);


    }
}