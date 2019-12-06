package com.example.sagv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.uname);
        e2=(EditText)findViewById(R.id.passwd);
        b=(Button)findViewById(R.id.loginbtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();
                if(s1.equals("gasv") && s2.equals("1234")) {

                    Toast.makeText(getApplicationContext(), "login success", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
