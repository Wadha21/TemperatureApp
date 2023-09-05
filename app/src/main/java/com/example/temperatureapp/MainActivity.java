package com.example.temperatureapp;
import java.lang.Double;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button compute;
    Double num;
    String temp,temp1,out;
    private EditText enterCelcius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compute = findViewById(R.id.compute);

        enterCelcius = findViewById(R.id.enterCelcius);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double celcius = Double.parseDouble(enterCelcius.getText().toString());
                num = ((celcius * 1.8) + 32);
                temp = String.format("%.2f", num);


                out = "Fahrenhite Tempreture is \n "+temp;
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("STRING_DATE", out);
                startActivity(i);
            }
        });
    }
}