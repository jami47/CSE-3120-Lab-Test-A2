package com.example.cse_3120_lab_test_a2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotorcycleTest {

    @Test
    public void drive() {
        Motorcycle motorcycle = new Motorcycle();
        assertEquals(0.0,motorcycle.rfuel(),0.0);
    }
}