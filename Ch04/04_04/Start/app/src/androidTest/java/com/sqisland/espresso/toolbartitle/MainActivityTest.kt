package com.sqisland.espresso.toolbartitle

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.Toolbar
import android.widget.TextView
import org.hamcrest.CoreMatchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
  @Rule @JvmField
  var activityRule = ActivityTestRule(MainActivity::class.java)

  @Test
  fun toolbarTitle() {
    // We want a View that satisfies all of the conditions,
    // is a TextView, and has a Toolbar parent. Then check that
    // the TextView has the correct title
    onView(
            allOf(
                    isAssignableFrom(TextView::class.java),
                    withParent(isAssignableFrom(Toolbar::class.java))))
            .check(matches(withText(R.string.title)))
  }
}