package com.sahrial.submission_1_jetpackpro.viewmodel

import androidx.lifecycle.ViewModel
import com.sahrial.submission_1_jetpackpro.data.MovieData
import com.sahrial.submission_1_jetpackpro.model.Movie_model

class MovieViewModel : ViewModel(){
    fun getMovie(): List<Movie_model> = MovieData.listDataMovie()
    fun getTV(): List<Movie_model> = MovieData.listDataTV()

}