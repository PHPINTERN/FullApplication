package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.StringReader;

public class MainActivity extends AppCompatActivity {
    EditText USER_NAME, PASSWORD;
    String URL;

    RequestQueue queue;
    StringRequest stringRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
//        USER_NAME = (EditText) findViewById(R.id.username);
//        PASSWORD = (EditText) findViewById(R.id.password);
        URL = "http://192.168.197.68:80/signin.php";

        queue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
//                Intent intent = new Intent(getApplicationContext(), Main_Page.class);
//                startActivity(intent);
                TextView textView = (TextView) findViewById(R.id.password);

                textView.setText(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView textView = (TextView) findViewById(R.id.password);
                String text="", Er =  textView.toString();
                Log.i(text, Er);  // Info level log
                textView.setText(error.toString());

            }
        });
        }
        catch (Exception e){
            TextView textView = (TextView) findViewById(R.id.password);
            textView.setText(e.toString());
        }

    }


    public void login(View view) {

        queue .add(stringRequest);


    }
    public void home(View view) {
        Intent intent = new Intent(getApplicationContext(), Main_Page.class);
        startActivity(intent);
    }

    public void New_Registration(View view) {
        Intent intent = new Intent(getApplicationContext(),New_Regiration_Student.class);
        startActivity(intent);
    }

    public void forgettenpassword(View view) {
        Intent intent = new Intent(getApplicationContext(),Forgetten_Password.class);
        startActivity(intent);
    }

    public void erp(View view) {
        Intent intent = new Intent(getApplicationContext(),ERP.class);
        startActivity(intent);
    }

    public void lms(View view) {
        Intent intent = new Intent(getApplicationContext(),LMS.class);
        startActivity(intent);
    }

    public void login_new(View view) {
        Intent intent = new Intent(getApplicationContext(),Log_In.class);
        startActivity(intent);
    }
}