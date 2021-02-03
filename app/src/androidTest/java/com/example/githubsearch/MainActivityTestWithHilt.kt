package com.example.githubsearch

import androidx.lifecycle.ViewModel
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.githubsearch.*
import com.example.githubsearch.viewmodel.GithubViewModel
import dagger.hilt.android.testing.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@HiltAndroidTest
@Config(application = HiltTestApplication::class)
@RunWith(AndroidJUnit4::class)
class MainActivityTestWithHilt {


    @BindValue
    @JvmField
    val viewModelFactory: GithubViewModelFactory = object : GithubViewModelFactory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return GithubViewModel() as T
        }
    }

    @get:Rule
    var hiltRule = HiltAndroidRule(this)


    @Before
    fun init() {
        hiltRule.inject()
    }


    @Test
    fun happyPath() {
        val activityScenario = launchActivity<MainActivity>();
        activityScenario.onActivity {
            Espresso.onView(ViewMatchers.withId(R.id.search_keyword_text_input))
                .perform(typeText("docker"))
            Espresso.onView(ViewMatchers.withId(R.id.search_button))
                .check(ViewAssertions.matches(ViewMatchers.withText(R.string.search_button_text)))

        }
    }
}
