package com.sahrial.submission_1_jetpackpro.model

import android.os.Parcelable
import com.sahrial.submission_1_jetpackpro.activity.click.ClickMovie
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Movie_model(
var id: String,
var title: String,
var genre: String,
var year: String,
var description: String,
var moviePoster: Int,
var movieBackground: Int
):Parcelable