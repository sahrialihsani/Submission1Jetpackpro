package com.sahrial.submission_1_jetpackpro.activity.detail

import androidx.lifecycle.ViewModel
import com.sahrial.submission_1_jetpackpro.data.MovieData
import com.sahrial.submission_1_jetpackpro.model.Movie_model

class DetailViewModel : ViewModel() {
    private lateinit var movid:String
    private lateinit var tvid:String

    fun setMovie(id:String){
        this.movid = id
    }

    fun setTv(id:String){
        this.tvid = id
    }
    private fun getMovie(): ArrayList<Movie_model> =
        MovieData.listDataMovie() as ArrayList<Movie_model>
    private fun getTV(): ArrayList<Movie_model> =
        MovieData.listDataTV() as ArrayList<Movie_model>

    fun getMoviebyID(): Movie_model {
        lateinit var res: Movie_model
        val listMovie = getMovie()
        for (movie in listMovie) {
            if (movie.id == movid) {
                res = movie
                break
            }
        }
        return  res
    }

    fun getTvbyID(): Movie_model {
        lateinit var res: Movie_model
        val listTv = getTV()
        for (tv in listTv) {
            if (tv.id == tvid) {
                res = tv
                break
            }
        }
        return  res
    }
}