package com.example.cse_3120_lab_test_a2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedTest {

        @Test
    public void color(){
            Red red = new Red();
            assertEquals("Red",red.showcolor());
        }

}