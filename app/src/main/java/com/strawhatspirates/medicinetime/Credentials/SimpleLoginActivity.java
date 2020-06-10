package com.strawhatspirates.medicinetime.Credentials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.strawhatspirates.medicinetime.R;
import com.strawhatspirates.medicinetime.medicine.MedicineActivity;

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

                    Intent intent = new Intent(SimpleLoginActivity.this, MedicineActivity.class);
                    startActivity(intent);
                    finish();

            }
        });

    }
}