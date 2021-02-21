package com.sahrial.submission_1_jetpackpro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.activity.click.ClickMovie
import com.sahrial.submission_1_jetpackpro.model.Movie_model
import kotlinx.android.synthetic.main.card_movie.view.*

class MovieAdapter(private val clickMovie: ClickMovie):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private val listMovie= ArrayList<Movie_model>()

    fun setData(movie:List<Movie_model>?){
        if(movie==null)
            return listMovie.clear()
        listMovie.addAll(movie)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {
      val view= LayoutInflater.from(parent.context).inflate(R.layout.card_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int= listMovie.size


    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
     holder.bind(listMovie[position])
    }
    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie_model) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(movie.moviePoster)
                    .apply(RequestOptions().override(350, 550))
                    .into(movie_detail_photo)
                tv_title.text =  movie.title
                tv_genre.text =  movie.genre
                tv_year.text =  movie.year
               constraint.setOnClickListener {
                   clickMovie.clickperMovie(movie)
               }
            }

        }

    }


}