package com.example.cse_3120_lab_test_a2;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void color(){
        onView(ViewMatchers.withId(R.id.colorview)).check(ViewAssertions.matches(ViewMatchers.withText("Color")));
    }
}
