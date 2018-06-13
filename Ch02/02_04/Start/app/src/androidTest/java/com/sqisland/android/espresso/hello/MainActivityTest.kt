package com.sqisland.android.espresso.hello

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// Add "@RunWith" annotation
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    // Create ActivityTestRule, launching MainActivity
    // before each test method
    @Rule @JvmField
    var activityRule = ActivityTestRule<MainActivity>(
            MainActivity::class.java
    )

    // Add "@Test" annotation
    @Test
    fun greet() {
    }
}