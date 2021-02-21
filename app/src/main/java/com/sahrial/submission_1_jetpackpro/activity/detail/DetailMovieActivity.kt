package com.sahrial.submission_1_jetpackpro.activity.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.data.MovieData.MOV
import com.sahrial.submission_1_jetpackpro.data.MovieData.TV
import com.sahrial.submission_1_jetpackpro.data.MovieData.setImage
import com.sahrial.submission_1_jetpackpro.databinding.ActivityDetailBinding
import com.sahrial.submission_1_jetpackpro.model.Movie_model
import kotlinx.android.synthetic.main.activity_detail.*

class DetailMovieActivity : AppCompatActivity() {
    companion object {
    const val EX_DATA = "ex_data"
        const val EX_TYPE = "ex_type"
}
    private lateinit var res: Movie_model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Detail"

        val vm = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]
        val id = intent.getStringExtra(EX_DATA)
        val type = intent.getStringExtra(EX_TYPE)

        if(type.equals(MOV)){
            id?.let {
                vm.setMovie(it)
            }
            res = vm.getMoviebyID()
        }
        else if (type.equals(TV)){
            id?.let {
                vm.setTv(it)
            }
            res = vm.getTvbyID()
        }
        setImage(this@DetailMovieActivity, res.moviePoster, movie_detail_photo)
        setImage(this@DetailMovieActivity, res.movieBackground, movie_detail_background)
        tv_movie_title.text=res.title
        tv_movie_genre.text = res.genre
        tv_movie_year.text = res.year
        tv_movie_description.text = res.description

    }

}