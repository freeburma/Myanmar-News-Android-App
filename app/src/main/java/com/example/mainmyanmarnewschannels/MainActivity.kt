package com.example.mainmyanmarnewschannels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity()
{

    private val TAG = "MyTag"
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //// Getting string array from String Resource
        val newsCompanyList = resources.getStringArray(R.array.mediaList)
        val newsUrlList = resources.getStringArray(R.array.mediaUrlList)

        val newsTabLayout = findViewById<TabLayout>(R.id.newsTabLayout)
        newsTabLayout.tabMode = TabLayout.MODE_SCROLLABLE               // Adding scrollable mode

        val pager = findViewById<ViewPager2>(R.id.viewPager)
        pager.adapter = PagerViewAadpter(supportFragmentManager, lifecycle, newsCompanyList.size, newsUrlList)

        //// Setting the names to the tab
        TabLayoutMediator(newsTabLayout, pager)
        {
                tab, position ->
                                tab.text = newsCompanyList[position]
        }.attach()


//        for (name in newsCompanyList)
//        {
////            Log.i(TAG, name.toString())
//            newsTabLayout.addTab(newsTabLayout.newTab().setText(name))
//        }
//
//
//        newsTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
//        {
//
//            override fun onTabSelected(tab: TabLayout.Tab?)
//            {
//                // Handle tab select
//                Log.i(TAG, "${tab?.id} ")
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?)
//            {
//                // Handle tab reselect
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?)
//            {
//
//                // Handle tab unselect
//            }

//        })//end newsTabLayout

    }//end onCreate()
}// end class