package com.sahrial.submission_1_jetpackpro.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {
    private lateinit var vm: MovieViewModel
    //Setup initialize viewmodel
    @Before
    fun settingUp(){
    vm = MovieViewModel()
    }
    //test getlistmovie
    @Test
    fun getMovie() {
        val listMovie = vm.getMovie()
        assertNotNull(listMovie)
        assertEquals(10, listMovie.size)
    }
    //test getlisttv
    @Test
    fun getTv() {
        val listTv = vm.getTV()
        assertNotNull(listTv)
        assertEquals(10, listTv.size)
    }
}