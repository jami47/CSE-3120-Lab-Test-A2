package com.example.cse_3120_lab_test_a2;

public abstract class Color {
    String name;

    public Color(String name)
    {
        this.name=name;
    }
    public String showcolor()
    {
        return name;
    }
}
