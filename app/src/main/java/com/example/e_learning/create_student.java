package com.example.e_learning;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class create_student extends AppCompatActivity {

    EditText StudentName,StudentPhoneNo,FatherName,FatherPhoneNo,MotherName,MotherPhoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_student);

        StudentName = (EditText) findViewById(R.id.student_name);
        StudentPhoneNo =(EditText) findViewById(R.id.student_phoneno);
        FatherName =(EditText) findViewById(R.id.father_name);
        FatherPhoneNo = (EditText) findViewById(R.id.father_phoneno);
        MotherName = (EditText) findViewById(R.id.mother_name);
        MotherPhoneNo = (EditText) findViewById(R.id.mother_phoneno);

    }
    public void Submit(View view) {



        String Student_Name = StudentName.getText().toString().trim();
        String Student_PhoneNo = StudentPhoneNo.getText().toString().trim(),Father_Name = FatherName.getText().toString().trim();
        String Father_PhoneNo = FatherPhoneNo.getText().toString().trim(),Mother_Name = MotherName.getText().toString().trim();
        String Mother_PhoneNo = MotherPhoneNo.getText().toString().trim();

        String url ="https://chandrapravesh.000webhostapp.com/Student_Regitration.php";

        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(),"Student_Created",Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"ERROR: "+error,Toast.LENGTH_SHORT).show();
            }
        }) {
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> param = new HashMap<String,String>();
                param.put("Student_Name",Student_Name);
                param.put("Student_PhoneNo",Student_PhoneNo);
                param.put("Father_Name",Father_Name);
                param.put("Father_PhoneNo",Father_PhoneNo);
                param.put("Mother_Name",Mother_Name);
                param.put("Mother_PhoneNo",Mother_PhoneNo);
                return super.getParams();
            }
        };
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        queue.add(request);

    }
}


