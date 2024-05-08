package com.example.cse_3120_lab_test_a2;

public class Sedan extends Vehicle{

    @Override
    public void drive() {
        if(fuel>=2.0){
            milage += 5;
            fuel -= 2;
        }
    }
}
