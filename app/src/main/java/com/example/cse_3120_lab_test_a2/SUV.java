package com.example.cse_3120_lab_test_a2;

public class SUV extends Vehicle{
    @Override
    public void drive() {
        if(fuel>=2.5){
            milage += 4;
            fuel -= 2.5;
        }
    }
}
