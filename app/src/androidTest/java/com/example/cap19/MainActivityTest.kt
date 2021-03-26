package com.example.cap19

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @Before
    fun setup(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun isActivityInView() {
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }


    @Test
    fun visibilityNextBtn() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.nextBtn)).check(matches(isDisplayed()))
    }

    @Test
    fun isNextBtnTextDisplayed() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.nextBtn)).check(matches(withText("next")))
    }


    @Test
    fun isNextButtonWorking() {
        onView(withId(R.id.nextBtn)).perform(click())

        onView(withText("Second Activity")).check(matches(isDisplayed()))
    }

}