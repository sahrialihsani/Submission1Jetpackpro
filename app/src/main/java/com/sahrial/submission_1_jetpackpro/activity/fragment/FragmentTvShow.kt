package com.sahrial.submission_1_jetpackpro.activity.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.activity.click.ClickMovie
import com.sahrial.submission_1_jetpackpro.activity.detail.DetailMovieActivity
import com.sahrial.submission_1_jetpackpro.adapter.MovieAdapter
import com.sahrial.submission_1_jetpackpro.data.MovieData.TV
import com.sahrial.submission_1_jetpackpro.model.Movie_model
import com.sahrial.submission_1_jetpackpro.viewmodel.MovieViewModel
import kotlinx.android.synthetic.main.fragment_tv_show.*


class FragmentTvShow : Fragment(),ClickMovie {

    private lateinit var vm : MovieViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.let {
            vm = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
        }
        val listdatatv=vm.getTV()
        setTv(listdatatv)
    }

    private fun setTv(movie: List<Movie_model>){
        rv_tv.apply {
            layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.VERTICAL, false )
            adapter = MovieAdapter(this@FragmentTvShow)
        }.also {
            it.adapter.let { adapter ->
                when (adapter) {
                    is MovieAdapter -> {
                        adapter.setData(movie)
                    }
                }
            }
        }
    }
    override fun clickperMovie(tvData: Movie_model){
        startActivity(
            Intent(context, DetailMovieActivity::class.java)
                .putExtra(DetailMovieActivity.EX_DATA, tvData.id)
                .putExtra(DetailMovieActivity.EX_TYPE, TV)
        )
    }
}