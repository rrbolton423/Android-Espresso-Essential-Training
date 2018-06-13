package com.sqisland.espresso.toolbartitle

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.BoundedMatcher
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
  @Rule @JvmField
  var activityRule = ActivityTestRule(MainActivity::class.java)

  @Test
  fun toolbarTitle() {
    onView(
        allOf(
            isAssignableFrom(TextView::class.java),
            withParent(isAssignableFrom(Toolbar::class.java))))
        .check(matches(withText(R.string.title)))
  }

  private fun withToolbarTitle(expectedTitle: CharSequence): Matcher<View> {
    // Return a bounded Matcher
    // We want a bounded matcher applying to the Toolbar class
    return object : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {

      override fun describeTo(description: Description?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
      }

      // matchesSafely() gets a Toolbar as a parameter
      override fun matchesSafely(toolbar: Toolbar?): Boolean {

        // Verify the title of the Toolbar that we expect
        return expectedTitle == toolbar?.title
      }

    }
  }
}