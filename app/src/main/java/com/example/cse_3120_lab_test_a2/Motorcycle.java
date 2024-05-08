package com.example.cse_3120_lab_test_a2;

public class Motorcycle extends Vehicle{
    @Override
    public void drive() {
        if(fuel>=0.5){
            milage += 1.5;
            fuel -= 0.5;
        }
    }
}
