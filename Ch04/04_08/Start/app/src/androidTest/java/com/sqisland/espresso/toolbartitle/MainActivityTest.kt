package com.sqisland.espresso.toolbartitle

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.BoundedMatcher
import android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.Toolbar
import android.view.View
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

    // Get the title we want to match form the string resources
    val title = InstrumentationRegistry.getTargetContext()
            .getString(R.string.title)

    // Find the Toolbar and check that is has the title
    // that we expect
    onView(isAssignableFrom(Toolbar::class.java))
            .check(matches(withToolbarTitle(title)))
  }

  private fun withToolbarTitle(expectedTitle: CharSequence): Matcher<View> {
    return object : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {
      override fun describeTo(description: Description?) {
        description?.appendText("with toolbar title: " + expectedTitle)
      }

      override fun matchesSafely(toolbar: Toolbar?): Boolean {
        return expectedTitle == toolbar?.title
      }

    }
  }
}