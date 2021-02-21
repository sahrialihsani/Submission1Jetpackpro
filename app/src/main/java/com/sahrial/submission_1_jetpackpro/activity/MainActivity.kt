package com.sahrial.submission_1_jetpackpro.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.activity.click.ClickMovie
import com.sahrial.submission_1_jetpackpro.activity.detail.DetailMovieActivity
import com.sahrial.submission_1_jetpackpro.adapter.MovieAdapter
import com.sahrial.submission_1_jetpackpro.adapter.SectPagerAdapter
import com.sahrial.submission_1_jetpackpro.model.Movie_model
import com.sahrial.submission_1_jetpackpro.viewmodel.MovieViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val sectpager = SectPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = sectpager
        tablayout.setupWithViewPager(viewPager)
    }
}