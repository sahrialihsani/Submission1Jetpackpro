package com.sahrial.submission_1_jetpackpro.activity

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.data.MovieData
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private val movieData = MovieData.listDataMovie()
    private val tvData = MovieData.listDataTV()
    //Rule
    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)
    //Test showlistmovie
    @Test
    fun showlistMovie(){
      onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movieData.size))
    }
    //test show detail movie
    @Test
    fun showdetailMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()))
        onView(withId(R.id.movie_detail_photo)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_detail_background)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_title)).check(matches(withText(movieData[0].title)))
        onView(withId(R.id.tv_movie_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_genre)).check(matches(withText(movieData[0].genre)))
        onView(withId(R.id.tv_movie_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_year)).check(matches(withText(movieData[0].year)))
        onView(withId(R.id.tv_movie_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_movie_description)).check(matches(withText(movieData[0].description)))

    }
        //Test showlistmovie
        @Test
        fun showlistTv() {
            onView(withText("Tv Show")).perform(click())
            onView(withId(R.id.rv_tv)).check(matches(isDisplayed()))
            onView(withId(R.id.rv_tv)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                    tvData.size
                )
            )
        }

        //test show detail movie
        @Test
        fun showdetailTv() {
            onView(withText("Tv Show")).perform(click())
            onView(withId(R.id.rv_tv)).check(matches(isDisplayed()))
            onView(withId(R.id.rv_tv)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    0,
                    click()
                )
            )
            onView(withId(R.id.movie_detail_photo)).check(matches(isDisplayed()))
            onView(withId(R.id.movie_detail_background)).check(matches(isDisplayed()))
            onView(withId(R.id.tv_movie_title)).check(matches(isDisplayed()))
            onView(withId(R.id.tv_movie_title)).check(matches(withText(tvData[0].title)))
            onView(withId(R.id.tv_movie_genre)).check(matches(isDisplayed()))
            onView(withId(R.id.tv_movie_genre)).check(matches(withText(tvData[0].genre)))
            onView(withId(R.id.tv_movie_year)).check(matches(isDisplayed()))
            onView(withId(R.id.tv_movie_year)).check(matches(withText(tvData[0].year)))
            onView(withId(R.id.tv_movie_description)).check(matches(isDisplayed()))
            onView(withId(R.id.tv_movie_description)).check(matches(withText(tvData[0].description)))

        }
}