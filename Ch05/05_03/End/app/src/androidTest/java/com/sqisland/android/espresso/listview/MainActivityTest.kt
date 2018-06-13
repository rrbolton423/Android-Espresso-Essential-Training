package com.sqisland.android.espresso.listview

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
  @Rule @JvmField
  var activityRule = ActivityTestRule(MainActivity::class.java)

  @Test
  fun clickItem() {
    onView(withId(R.id.footer))
        .check(matches(not(isDisplayed())))
  }
}