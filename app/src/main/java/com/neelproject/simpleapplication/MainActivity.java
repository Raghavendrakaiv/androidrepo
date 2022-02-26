package com.neelproject.simpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void reg(View view) {
        EditText firstname = findViewById(R.id.editTextTextPersonName1);
        EditText lastname = findViewById(R.id.editTextTextPersonName2);
        EditText email = findViewById(R.id.editTextTextPersonName3);

        TextView f = findViewById(R.id.textView1);
        TextView l = findViewById(R.id.textView2);
        TextView e = findViewById(R.id.textView3);


        f.setText(firstname.getText().toString());

        l.setText(lastname.getText().toString());

        e.setText(email.getText().toString());


    }
}