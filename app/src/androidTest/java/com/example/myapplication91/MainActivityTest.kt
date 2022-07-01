package com.example.myapplication91

import android.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(
        MainActivity::class.java
    )

    @Before
    @Throws(Exception::class)
    fun setUp() {
    }

    @Test
    @Throws(Exception::class)
    fun onClick() {
        onView(withId(com.example.myapplication91.R.id.editTextTextPersonName1)).perform(typeText("Field1"))
        onView(withId(com.example.myapplication91.R.id.editTextTextPersonName2)).perform(typeText("Field2"))
        onView(withId(com.example.myapplication91.R.id.button)).perform(click())
        onView(withId(com.example.myapplication91.R.id.textView)).check(matches(withText("Field1Field2")))
    }
}