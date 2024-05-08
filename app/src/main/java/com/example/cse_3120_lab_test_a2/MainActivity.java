package com.example.cse_3120_lab_test_a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText vht, pet, clt;
    Vehicle vehicle;
    Color color;

    TextView milview, petview, colview;

    Button drivebtn, colbtn, petbtn, addvhbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vht = findViewById(R.id.vehicleedt);
        pet = findViewById(R.id.petroledt);
        clt = findViewById(R.id.coloredt);

        milview= findViewById(R.id.milage);
        petview = findViewById(R.id.petrol);
        colview = findViewById(R.id.colorview);

        drivebtn = findViewById(R.id.drivebtn);
        colbtn = findViewById(R.id.showcolorbtn);
        petbtn = findViewById(R.id.petroladdbtn);
        addvhbtn = findViewById(R.id.addvhbtn);

        addvhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vht.getText().toString().equalsIgnoreCase("Motorcycle")){
                    Vehicle test = new Motorcycle();

                }
            }
        });



    }
}