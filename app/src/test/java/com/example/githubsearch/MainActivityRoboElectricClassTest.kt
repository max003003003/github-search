package com.example.githubsearch

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.githubsearch.MainActivity
import com.example.githubsearch.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@Config(sdk = [Config.OLDEST_SDK])
class MainActivityRoboElectricClassTest {

    private lateinit var activityScenario: ActivityScenario<MainActivity>
    @Before
    fun setup() {
        activityScenario = launchActivity<MainActivity>()

    }
    @Test
    fun shouldHaveTextViewThatDisplayHelloMessage() {
        activityScenario.onActivity {
            onView(withId(R.id.hello_tv)).check(matches(withText(R.string.hello_text)))

        }
    }
    @Test
    fun shouldHaveTextInput() {
        activityScenario.onActivity {
            onView(withId(R.id.search_keyword_text_input)).check(matches(isDisplayed()))
        }
    }
    @Test
    fun shouldHaveSearchButton() {
        activityScenario.onActivity {
            onView(withId(R.id.search_button)).check(matches(withText(R.string.search_button_text)))
        }
    }




}
