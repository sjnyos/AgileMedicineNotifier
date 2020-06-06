package com.strawhatspirates.agilemedicinenotifier.Credentials;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.strawhatspirates.agilemedicinenotifier.R;


public class SimpleLoginActivity extends AppCompatActivity {
private EditText nameid,pass;
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_login);


        btn = findViewById(R.id.Login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

    }
}