package com.example.cse_3120_lab_test_a2;

public abstract class Vehicle {
    public int wheels;
    public Double fuel= (double) 0;
    public Double milage= (double) 0;

    public Color color;


    public  int rwheels(){
        return wheels;
    }
    public  Double rfuel(){
        return fuel;
    }
    public  Double rmilage(){
        return milage;
    }
    public void rpetrol(Double fl){
        fuel += fl;
    }
    public abstract void drive();

}
