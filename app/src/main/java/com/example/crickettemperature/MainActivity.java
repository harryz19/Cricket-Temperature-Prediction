package com.example.crickettemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nch;
    Button bid;
    TextView rid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nch = findViewById(R.id.nch);
        bid = findViewById(R.id.bid);
        rid = findViewById(R.id.rid);

        bid.setOnClickListener(view -> {

        if(nch.getText().toString().length()!= 0)
        {
            double temperature = Integer.parseInt(nch.getText().toString())/3.0 + 4.0;
            rid.setText("The appropriate temperature outside is "+temperature+" degrees Celsius.");
        }
        else
            Toast.makeText(this,"Please fill out this field.",Toast.LENGTH_SHORT).show();

        });


    }
}