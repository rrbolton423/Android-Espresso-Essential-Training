package com.sqisland.android.espresso.hello

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.not
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
  @Rule @JvmField
  var activityRule = ActivityTestRule<MainActivity>(
      MainActivity::class.java)

  @Test
  fun greet() {
    onView(withId(R.id.greeting))
        .check(matches(withText("")))

    onView(withId(R.id.greet_button))
        .perform(click())
        .check(matches(not(isEnabled())))

    onView(withId(R.id.greeting))
        .check(matches(withText(R.string.hello)))
  }
}