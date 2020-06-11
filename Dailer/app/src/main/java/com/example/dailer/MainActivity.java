package com.example.dailer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mnumber;
    Button btn;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mnumber = findViewById(R.id.numberET);
        btn = findViewById(R.id.dailBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = mnumber.getText().toString().trim();
                Intent i= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Uri.encode(number)) );
                startActivity(i);

            }
        });
    }
}