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
    Double oil;

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
                    if(clt.getText().toString().equalsIgnoreCase("Red"))
                    {
                        test.color = new Red();
                        vehicle = test;
                    }
                    else if(clt.getText().toString().equalsIgnoreCase("Green"))
                    {
                        test.color = new Green();
                        vehicle = test;

                    }
                    else if(clt.getText().toString().equalsIgnoreCase("Blue"))
                    {
                        test.color = new Blue();
                        vehicle = test;

                    }
                }
            }
        });

        drivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehicle.drive();
                milview.setText(String.valueOf(vehicle.rmilage()));
                petview.setText(String.valueOf(vehicle.rfuel()));
            }
        });

        petbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oil = Double.valueOf(pet.getText().toString().trim());
                vehicle.rpetrol(oil);
                milview.setText(String.valueOf(vehicle.rmilage()));
                petview.setText(String.valueOf(vehicle.rfuel()));
            }
        });

        colbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colview.setText(String.valueOf(vehicle.color.showcolor()));
            }
        });

    }
}