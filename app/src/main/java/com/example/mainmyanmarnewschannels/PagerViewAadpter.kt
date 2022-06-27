package com.example.mainmyanmarnewschannels

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.sql.Array

class PagerViewAadpter(fragmentManager: FragmentManager, lifecycle: Lifecycle, private var numOfSlides: Int, private val newsUrlList: kotlin.Array<String>) : FragmentStateAdapter(fragmentManager, lifecycle)
{
    // end class PagerViewAadpter
    override fun getItemCount(): Int
    {
        return numOfSlides
    }// end getItemCount()

    override fun createFragment(position: Int): Fragment
    {
        return NewsWebviewFragment(newsUrlList[position])
    }// end createFragment


}