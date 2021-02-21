package com.sahrial.submission_1_jetpackpro.adapter

import android.content.Context
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.activity.fragment.FragmentMovie
import com.sahrial.submission_1_jetpackpro.activity.fragment.FragmentTvShow

class SectPagerAdapter(private val context: Context, fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val title = intArrayOf(
        R.string.movie,
        R.string.tvshow
    )
    override fun getItem(position: Int): Fragment {
       var fg : Fragment? = null
        when(position){
            0->fg = FragmentMovie()
            1->fg = FragmentTvShow()
        }
        return fg as Fragment

    }
 @Nullable
 override fun getPageTitle(position: Int): CharSequence?{
     return context.resources.getString(title[position])
 }
    override fun getCount(): Int {
        return 2
    }
}