package com.sahrial.submission_1_jetpackpro.activity.detail

import com.sahrial.submission_1_jetpackpro.data.MovieData
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {
    private lateinit var detailvm: DetailViewModel
    private val movieData = MovieData.listDataMovie()[0]
    private val tvData = MovieData.listDataTV()[0]
    private val idMovie = movieData.id
    private val idTv = tvData.id

    //SetUp initialize viewmodel
    @Before
    fun settingUp(){
        detailvm = DetailViewModel()
        detailvm.setMovie(idMovie)
        detailvm.setTv(idTv)
    }
    //test movie
    @Test
    fun getMovID() {
        val moviebyId = detailvm.getMoviebyID()
        assertNotNull(moviebyId)
        assertEquals(movieData.title, moviebyId.title)
        assertEquals(movieData.genre, moviebyId.genre)
        assertEquals(movieData.year, moviebyId.year)
        assertEquals(movieData.description, moviebyId.description)
        assertEquals(movieData.moviePoster, moviebyId.moviePoster)
        assertEquals(movieData.movieBackground, moviebyId.movieBackground)
    }
    //Test tv show
    @Test
    fun getTvID() {
        val tv = detailvm.getTvbyID()
        assertNotNull(tv)
        assertEquals(tvData.title, tv.title)
        assertEquals(tvData.genre, tv.genre)
        assertEquals(tvData.year, tv.year)
        assertEquals(tvData.description, tv.description)
        assertEquals(tvData.moviePoster, tv.moviePoster)
        assertEquals(tvData.movieBackground, tv.movieBackground)
    }
}