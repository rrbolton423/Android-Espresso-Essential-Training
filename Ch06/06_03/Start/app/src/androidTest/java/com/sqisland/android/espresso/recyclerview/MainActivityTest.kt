package com.sqisland.android.espresso.recyclerview

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// Run as Android test
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    // JUnit TestRule
    @Rule @JvmField
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun clickItem() {

        // Verify that the footer is not displayed
        onView(withId(R.id.footer))
                .check(matches(not(isDisplayed())))
    }
}